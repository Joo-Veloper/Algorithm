package pg.Lv1;

import java.util.Arrays;
import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(Arrays.toString(solution(n,m)));
    }

    private static int[] solution(int n, int m) {
        int a = n;
        int b = m;

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        int gcd = a;
        int lcm = (n * m) / gcd;

        return new int[]{gcd, lcm};
    }
}
