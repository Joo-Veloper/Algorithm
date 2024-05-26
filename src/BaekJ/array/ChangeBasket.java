package BaekJ.array;

import java.util.Scanner;

public class ChangeBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int j = sc.nextInt() - 1;
            int k = sc.nextInt() - 1 ;
            while (j < k) {
                int temp = baskets[j];
                baskets[j++] = baskets[k];
                baskets[k--] = temp;
            }
        }
        for (int baguni:baskets)
            System.out.print(baguni + " ");
    }
}
