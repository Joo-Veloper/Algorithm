package pg.Lv1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CardDummy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] cards1 = new String[n];
        for (int i = 0; i < n; i++) {
            cards1[i] = sc.next();
        }

        int m = sc.nextInt();
        String[] cards2 = new String[m];
        for (int i = 0; i < m; i++) {
            cards2[i] = sc.next();
        }

        int k = sc.nextInt();
        String[] goal = new String[k];
        for (int i = 0; i < k; i++) {
            goal[i] = sc.next();
        }
        System.out.println(solution(cards1, cards2, goal));

    }

    private static String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));

        for (String word : goal) {
            if (!q1.isEmpty() && q1.peek().equals(word)) {
                q1.poll();
            } else if (!q2.isEmpty() && q2.peek().equals(word)) {
                q2.poll();
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
