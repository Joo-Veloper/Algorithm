package BaekJ.array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            int tmp;
            int X = sc.nextInt();
            int Y = sc.nextInt();

            tmp = arr[X - 1];
            arr[X - 1] = arr[Y - 1];
            arr[Y - 1] = tmp;
        }
        sc.close();

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
