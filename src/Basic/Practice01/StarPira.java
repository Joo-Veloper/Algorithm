package Basic.Practice01;

import java.util.Scanner;

public class StarPira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("피라미드 크기");
            n = sc.nextInt();
        } while (n <= 0);
        spira(n);
    }
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n - i ; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= (i-1)*2+1 ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}

