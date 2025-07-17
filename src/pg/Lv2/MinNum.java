package pg.Lv2;

import java.util.Arrays;
import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A 배열 크기 입력: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        System.out.println("A 배열 원소 입력:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("B 배열 원소 입력:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        int result = solution(A, B);
        System.out.println("최솟값: " + result);
    }

    public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            answer += A[i] * B[n - 1 - i];
        }

        return answer;
    }
}
