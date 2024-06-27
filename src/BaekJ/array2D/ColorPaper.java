package BaekJ.array2D;

import java.util.Scanner;

public class ColorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] papper = new int[100][100];
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int x = sc.nextInt(); // 색종이의 왼쪽 변 사이의 거리
            int y = sc.nextInt(); // 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    papper[k][j] = 1;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (papper[i][j] == 1) {
                    res += papper[i][j];
                }
            }
        }
        System.out.println(res);
    }
}
