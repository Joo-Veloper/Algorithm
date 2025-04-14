package EAL._02_array;

import java.util.Scanner;

public class P09_MaximumSumOfGridPlates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(Solution(n, arr));
    }

    private static int Solution(int n, int[][] arr) {
        // 최댓값을 저장할 변수 아주 작은 수로 초기화
        int answer = -2147000000;

        // 각 행 열 합 저장
        int sum1, sum2 = 0;

        for (int i = 0; i < n; i++) {
            // 0으로 초기화
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        // 0으로 초기화
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }
}