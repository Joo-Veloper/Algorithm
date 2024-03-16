package Basic.Practice01;

import java.util.Scanner;

public class NumPira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Number piramid siz");
            n = sc.nextInt();
        } while (n <= 0);
        spira(n);
    }

    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }

}
