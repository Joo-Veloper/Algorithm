package EAL._01_string;

import java.util.Scanner;

public class P02_Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(soultion(word));
    }

    private static String soultion(String word) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            }
        }
        return answer.toString();
    }
}
