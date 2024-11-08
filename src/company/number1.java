package company;

import java.util.HashMap;
import java.util.Map;

public class number1 {


    public int solution(int k, int[] score) {
        // 점수 차이를 저장할 맵
        Map<Integer, Integer> difference = new HashMap<>();

        // 인접한 점수 간의 차이 계산
        for (int i = 1; i < score.length; i++) {
            int diff = score[i - 1] - score[i];
            difference.put(diff, difference.getOrDefault(diff, 0) + 1);
        }

        // 조작된 점수를 기록하기 위한 맵
        Map<Integer, Boolean> manipulatedScores = new HashMap<>();

        // 차이의 빈도가 k 이상인 경우를 찾아 조작된 점수로 표시
        for (Map.Entry<Integer, Integer> entry : difference.entrySet()) {
            if (entry.getValue() >= k) {
                int diff = entry.getKey();
                for (int i = 1; i < score.length; i++) {
                    if (score[i - 1] - score[i] == diff) {
                        manipulatedScores.put(score[i - 1], true);
                        manipulatedScores.put(score[i], true);
                    }
                }
            }
        }

        // 조작되지 않은 점수 개수 계산
        int nonManipulatedCount = 0;
        for (int s : score) {
            if (!manipulatedScores.getOrDefault(s, false)) {
                nonManipulatedCount++;
            }
        }

        return nonManipulatedCount;
    }
}
