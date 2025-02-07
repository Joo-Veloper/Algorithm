package EAL._02_array;

import java.util.Scanner;

public class P09_MaximumSumOfGridPlates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n]; // n * n 배열 만듬

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Solution(n, arr));
    }

    private static int Solution(int n, int[][] arr) {
        int answer = 0;
        // 행의 합
        for (int i = 0; i < n; i++) {
            int row = 0;
            for (int j = 0; j < n; j++) {
                row += arr[i][j];
            }
            if (row > answer) {
                answer = row;
            }
        }

        // 열의 합
        for (int j = 0; j < n; j++) {
            int column = 0;
            for (int i = 0; i < n; i++) {
                column += arr[i][j];
            }
            if (column > answer) {
                answer = column;
            }
        }

        // 대각선의 합1
        int cross1 = 0;
        for (int i = 0; i < n; i++) {
            cross1 += arr[i][i];
        }
        if (cross1 > answer) {
            answer = cross1;
        }

        // 대각선의 합2
        int cross2 = 0;
        for (int i = 0; i < n; i++) {
            cross2 += arr[i][n - 1 - i];
        }
        if (cross2 > answer) {
            answer = cross2;
        }

        return answer;
    }

}