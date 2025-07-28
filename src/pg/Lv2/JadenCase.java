package pg.Lv2;

import java.util.Scanner;

public class JadenCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        boolean isStartOfWord = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
                isStartOfWord = true;
            } else {
                if (isStartOfWord) {
                    answer.append(Character.toUpperCase(c));
                    isStartOfWord = false;
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }

        return answer.toString();
    }
}
