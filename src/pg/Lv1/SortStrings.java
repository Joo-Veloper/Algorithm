package pg.Lv1;

import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 3;
        String[] strings = new String[x];
        for (int i = 0; i < x; i++) {
            strings[i] = sc.next();
        }

        int n = sc.nextInt();

        System.out.println(Arrays.toString(solution(strings, n)));
    }

    private static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(1);
        }

        return answer;
    }
}
