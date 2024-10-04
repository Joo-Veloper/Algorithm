package BaekJ.recursion;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MergeAlignment {
    static int[] A, tmp;
    static int count = 0;
    static int result = -1;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        tmp = new int[N];
        merge_sort(A, 0, N - 1);
        System.out.println(result);

    }

    public static void merge_sort(int[] A, int p, int r) {
        if (count > K) return ;
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if(A[i] <= A[j]) {
                tmp[t] = A[i];
                i++;
            }else {
                tmp[t] = A[j];
                j++;
            }
            t++;
        }

        while (i <= q)
            tmp[t++] = A[i++];

        while (j <= r)
            tmp[t++] = A[j++];

        i = p;
        t = 0;
        while (i <= r) {
            count++;
            if (count == K) {
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }
}

/*

        merge_sort(A[p..r]) { # A[p..r]을 오름차순 정렬한다.
        if (p < r) then {
        q <- ⌊(p + r) / 2⌋;       # q는 p, r의 중간 지점
        merge_sort(A, p, q);      # 전반부 정렬
        merge_sort(A, q + 1, r);  # 후반부 정렬
        merge(A, p, q, r);        # 병합
        }
        }

        # A[p..q]와 A[q+1..r]을 병합하여 A[p..r]을 오름차순 정렬된 상태로 만든다.
        # A[p..q]와 A[q+1..r]은 이미 오름차순으로 정렬되어 있다.
        merge(A[], p, q, r) {
        i <- p; j <- q + 1; t <- 1;
        while (i ≤ q and j ≤ r) {
        if (A[i] ≤ A[j])
        then tmp[t++] <- A[i++]; # tmp[t] <- A[i]; t++; i++;
        else tmp[t++] <- A[j++]; # tmp[t] <- A[j]; t++; j++;
        }
        while (i ≤ q)  # 왼쪽 배열 부분이 남은 경우
        tmp[t++] <- A[i++];
        while (j ≤ r)  # 오른쪽 배열 부분이 남은 경우
        tmp[t++] <- A[j++];
        i <- p; t <- 1;
        while (i ≤ r)  # 결과를 A[p..r]에 저장
        A[i++] <- tmp[t++];
        }*/
