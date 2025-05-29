package pg.Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ClosestEquivalentLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Arrays.toString(solution(s)));
    }

    private static int[] solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                answer[i] = i - map.get(c);
            } else {
                answer[i] = -1;
            }
            map.put(c, i);
        }
        return answer;
    }
}
