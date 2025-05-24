package pg.Lv1;

import java.util.Scanner;

public class YinYangPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] absolutes = new int[n];
        boolean[] signs = new boolean[n];

        for (int i = 0; i < n; i++) {
            absolutes[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            signs[i] = sc.nextBoolean();
        }

        System.out.println(solution(absolutes, signs));
    }

    private static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                sum +=absolutes[i];
            } else {
                sum -= absolutes[i];
            }
        }
        return sum;
    }
}
