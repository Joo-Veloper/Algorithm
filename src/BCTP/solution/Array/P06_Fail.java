package BCTP.solution.Array;

import java.util.*;

public class P06_Fail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int M = sc.nextInt();
        int[] stages = new int[M];

        for (int i = 0; i < M; i++) {
            stages[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        int[] challenger = new int[N + 2];
        for (int stage : stages) {
            challenger[stage]++;
        }

        List<Map.Entry<Integer, Double>> fails = new ArrayList<>();
        double total = stages.length;

        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) {
                fails.add(new AbstractMap.SimpleEntry<>(i, 0.0));
            } else {
                fails.add(new AbstractMap.SimpleEntry<>(i, ((double) challenger[i]) / total));
                total -= challenger[i]; // 다음 스테이지로 넘어갈 때 인원 감소
            }
        }

        fails.sort((o1, o2) -> {
            if (o1.getValue().equals(o2.getValue())) {
                return Integer.compare(o1.getKey(), o2.getKey());
            }
            return Double.compare(o2.getValue(), o1.getValue());
        });

        return fails.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}
