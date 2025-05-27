package pg.Lv1;

import java.util.Scanner;

public class AThreeDigitReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        String binary = Integer.toString(n, 3);

        String reverse = new StringBuilder(binary).reverse().toString();

        return Integer.parseInt(reverse, 3);
    }
}
