package EAL._02_array;

import java.util.Scanner;

public class P10_Mountaintop {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
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
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 기본적으로 봉우리라고 가정
                boolean isPeak = true;

                // 네 방향 탐색
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[i][j] <= arr[nx][ny]) {
                        isPeak = false;
                        break;
                    }
                }
                if (isPeak) count++;
            }
        }
        return count;
    }
}