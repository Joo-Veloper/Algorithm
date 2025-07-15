package pg.Lv2;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String[] parts = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String part : parts) {
            int num = Integer.parseInt(part);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return min + " " + max;
    }
}
