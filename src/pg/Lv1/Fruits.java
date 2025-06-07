package pg.Lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 최상품 사과 점수
        int k = sc.nextInt();
        // 사과 포장 개수 (m 개씩 담아서 포장)
        int m = sc.nextInt();

        int t = sc.nextInt();
        int[] score = new int[t];
        for (int i = 0; i < t; i++) {
            score[i] = sc.nextInt();
        }

        System.out.println(solution(k, m, score));
    }

    private static int solution(int k, int m, int[] score) {
        int answer = 0;
        // 내림차순 정렬
        Integer[] boxed = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Collections.reverseOrder());
        int boxCount = boxed.length / m;

        for (int i = 0; i < boxCount; i++) {
            int min = boxed[i * m + m - 1]; // 각 상자 내에서 가장 낮은 점수 (정렬되어 있으므로 마지막 원소)
            answer += min * m;
        }
        return answer;
    }
}
