package EAL._01_string;

import java.util.Scanner;

public class P07_PalindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(soultion(str));
    }

    private static String soultion(String str) {
        str = str.toLowerCase();
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }
        return "YES";
    }
}
