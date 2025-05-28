package pg.Lv1;

import java.util.Scanner;
public class CreateStrangeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
        sc.close();
    }

    private static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ", -1);

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
            }
        }
        return sb.toString();
    }
}