package BaekJ.FactorsAndMultiplesAndDecimals;

import java.util.Scanner;

public class FractionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int numerator = a * d + b * c; // 분자 계산
        int denominator = b * d; // 분모 계산

        int gcd = gcd(numerator, denominator);
        numerator /= gcd; // 분자 나누기 GCD
        denominator /= gcd; // 분모 나누기 GCD

        System.out.println(numerator + " " + denominator);
        sc.close();
    }

    // 최대공약수(GCD) 구하는 함수
    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
