package BCTP.solution.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Problem4_ON {
    private static final Logger log = Logger.getGlobal();
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    private static int[] solution(int[] answers) {
        // 수포자들의 패턴
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 점수 저장
        int[] scores = new int[3];

        // for 루프로 answers 확인
        for (int i = 0; i < answers.length; i++) {
            // for 루프로 pattern 하나씩 확인
            for (int j = 0; j < pattern.length; j++) {
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }
            }
        }
        // 최대값 저장
        int maxScore = Arrays.stream(scores).max().getAsInt();

        // 가장 높은 점수의 수포자 찾기
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answer.add(i + 1); // 수포자의 번호가 배열 인덱스와 다르기 때문에 1번수포자를 찾으려면 +1 해줘야함
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
