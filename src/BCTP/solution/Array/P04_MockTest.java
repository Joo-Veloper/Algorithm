package BCTP.solution.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P04_MockTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] answers = new int[n];
        for (int i = 0; i < n; i++) {
            answers[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(solution(answers)));
    }

    private static int[] solution(int[] answers) {

        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    score[j]++;
                }
            }
        }
        // 가장 높은 점수 저장
        int max = Arrays.stream(score).max().getAsInt();

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
