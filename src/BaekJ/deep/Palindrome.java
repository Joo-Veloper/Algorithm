package BaekJ.deep;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int str = s.length();

        for (int i = 0; i < str - 1; i++) {
            if (s.charAt(i) != s.charAt(str - i - 1)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
