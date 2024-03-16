package Basic.Practice01;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("삼각형을 출력합니다.");
        do {
            System.out.print("단수를 입력하세요");
            n = sc.nextInt();
        } while (n <= 0);

        System.out.println("왼쪽 아래 삼각형");
        triangleLB(n);

        System.out.println("왼쪽 위 삼각형");
        triangleLU(n);

        System.out.println("오른쪽 위");
        triangleRU(n);

        System.out.println("오른쪽 아래");
        triangleRB(n);
    }

    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleRB(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
