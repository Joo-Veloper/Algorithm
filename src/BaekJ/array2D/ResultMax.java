package BaekJ.array2D;

import java.util.Scanner;

public class ResultMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int row = 1;
        int column = 1;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                    row = i;
                    column = j;
                }
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println(row + " " + column);
    }
}
