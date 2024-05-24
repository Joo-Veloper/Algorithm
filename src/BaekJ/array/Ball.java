package BaekJ.array;

import java.util.Scanner;

public class Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// 바구니 개수
        int M = sc.nextInt();// 공을 넣는 작업의 횟수

        int[] baskets = new int[N];


        for (int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int index = i - 1; index < j; index++) {
                baskets[index] = k;
            }
        }
        for (int b = 0; b < N; b++) {
            System.out.print(baskets[b]);
            if (b < N - 1) {
                System.out.print(" ");
            }
        }
    }
}
