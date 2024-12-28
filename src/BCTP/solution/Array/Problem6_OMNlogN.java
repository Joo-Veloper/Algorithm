package BCTP.solution.Array;

import java.util.HashMap;
import java.util.Map;

public class Problem6_OMNlogN {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = solution.solution(N, stages);
        for (int stage : result) {
            System.out.print(stage + " ");
        }
    }

    static class Solution {
        public int[] solution(int N, int[] stages) {
            int[] challenger = new int[N + 2]; // 각 스테이지에 도달한 사용자 수 저장
            for (int i = 0; i < stages.length; i++) {
                challenger[stages[i]] += 1;
            }

            Map<Integer, Double> fails = new HashMap<>();
            double total = stages.length; // 전체 사용자 수

            for (int i = 1; i <= N; i++) { // 1번 스테이지부터 N번 스테이지까지 실패율 계산
                if (challenger[i] == 0) { // 도달한 사용자가 없는 경우 실패율 0
                    fails.put(i, 0.0);
                } else {
                    fails.put(i, challenger[i] / total);
                    total -= challenger[i]; // 클리어하지 못한 사용자 제외
                }
            }

            // 실패율을 기준으로 내림차순 정렬, 실패율이 같으면 스테이지 번호 오름차순
            return fails.entrySet().stream()
                    .sorted((o1, o2) -> {
                        if (o2.getValue().compareTo(o1.getValue()) == 0) {
                            return Integer.compare(o1.getKey(), o2.getKey());
                        } else {
                            return o2.getValue().compareTo(o1.getValue());
                        }
                    })
                    .mapToInt(Map.Entry::getKey) // 정렬된 키(스테이지 번호)를 배열로 변환
                    .toArray();
        }
    }
}
