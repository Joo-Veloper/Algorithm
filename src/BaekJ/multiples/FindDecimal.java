package BaekJ.multiples;

import java.util.Scanner;
public class FindDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (is_prime(num)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

    private static boolean is_prime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
