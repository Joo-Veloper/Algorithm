package pg.Lv1;

import java.util.Scanner;

public class MinimumRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] sizes = new int[n][2];

        for (int i = 0; i < n; i++) {
            sizes[i][0] = sc.nextInt(); // 가로
            sizes[i][1] = sc.nextInt(); // 세로
        }

        System.out.println(solution(sizes));
    }

    private static int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];

            int width = Math.max(w, h);
            int height = Math.min(w, h);

            if (width > maxW) {
                maxW = width;
            }
            if (height > maxH) {
                maxH = height;
            }


        }

        return maxW * maxH;
    }
}
