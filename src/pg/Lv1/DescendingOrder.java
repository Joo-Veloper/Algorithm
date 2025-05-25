package pg.Lv1;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        return new StringBuilder(new String(arr)).reverse().toString();
    }
}
