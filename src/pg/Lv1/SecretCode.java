package pg.Lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecretCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String skip = sc.next();
        int index = sc.nextInt();
        System.out.println(solution(s, skip, index));
    }

    private static String solution(String s, String skip, int index) {
        List<Character> available = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!skip.contains(String.valueOf(c))) {
                available.add(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int curIndex = available.indexOf(ch);
            int newIndex = (curIndex + index) % available.size();
            result.append(available.get(newIndex));
        }

        return result.toString();
    }
}
