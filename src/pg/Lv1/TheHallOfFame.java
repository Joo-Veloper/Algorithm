package pg.Lv1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TheHallOfFame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int n = sc.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(solution(k, score)));
    }

    private static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);

            if (pq.size() > k) {
                pq.poll();
            }
            answer[i] = pq.peek();
        }

        return answer;
    }
}
