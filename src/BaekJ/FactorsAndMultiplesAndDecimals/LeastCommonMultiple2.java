package BaekJ.FactorsAndMultiplesAndDecimals;

import java.util.Scanner;

public class LeastCommonMultiple2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();

        long lcm = (N * M) / gcd(N, M);

        System.out.println(lcm);

        sc.close();
    }
    public static Long gcd(Long A, Long B) {
        if (B == 0) {
            return A;
        } else {
            return gcd(B, A % B);
        }
    }
}