package EAL._03_TwoPointer;

import java.util.Scanner;

public class P03_MaxSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N일 동안 매출기록
        int n = sc.nextInt();
        // 연속된 K일 동안
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(solution(n,k,a));
    }

    private static int solution(int n, int k, int[] a) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += a[i];
        }

        answer += sum;

        for (int i = k; i < n; i++) {
            // 배열: a = [3, 5, 2, 6, 1], k = 3
            //처음 구간: 3 + 5 + 2 = 10
            //다음: 10 - 3 + 6 = 13
            //다음: 13 - 5 + 1 = 9
            // 현재합 - 빠진합 + 새로들어온합
            sum = sum - a[i - k] + a[i];

            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
