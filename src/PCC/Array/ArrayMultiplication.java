package PCC.Array;

import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 행렬의 크기와 요소 입력
        int[][] arr1 = new int[3][2];
        System.out.println("첫 번째 행렬 (3x2)의 요소를 입력하세요:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // 두 번째 행렬의 크기와 요소 입력
        int[][] arr2 = new int[2][2];
        System.out.println("두 번째 행렬 (2x2)의 요소를 입력하세요:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // 행렬 곱셈 수행
        int[][] result = solution(arr1, arr2);

        // 결과 출력
        System.out.println("행렬 곱셈 결과:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;

        int[][] answer = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
