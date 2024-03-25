package PCC.RequiredGrammar;

/**
 * 그녀가 만든 프렌즈 오천성이 대성공을 거뒀지만 최근 신규 사용자 수가 급감했기 때문이며 원인은 신규 사용자와 기존 사용자 사이에 스테이지
 * 차이가 너무 큰것이 문제
 * <p>
 * 실패율 정의 : 스테이지에 도달 했으나 아직 클리어하지못한 플레이어의 수/ 스테이지에 도달한 플레이어의 수
 */
/*스테이지 개수 N 1 이상 500이하
 * stages 길이 1이상 2.000.000 이하
 * stages 에 1이상 N+1이하의 자연수
 * 만약 실패율 같은 스테이지 있다면 작은 번호의 스테이지가 먼저 오면 됩니다.
 * 스테이지에 도달한 유저가 없는 경우 스테이지 실패율 0*/

import java.util.*;

public class Fail {
    public int[] solution(int N, int[] stages) {
        // 1 각 스테이지에 도전하는 사용자 수를 저장하는 데 사용하는 배열 크기를 N+2로 정한 이유도 나름의 문제 풀기 위한 전략
        // N번째 스테이지 클리어한 사용자는 stage 가 N + 1 입니다. Challenger 배열에서 N + 1 위치에 데이터를 저장해야하는데 배열의 인덱스는
        // 0부터 시작하기 에 N + 1 인덱스에 데이터를 저장하려면 N + 1의 크기의 배열이 필요

        int[] challenger = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            stages[i] += 1;
        }
        // 2 fails는 실패율을 저장하는 용도
        // total  은 총 사용자 수
        // total 변수를 double로 선언한 것에 주의하면 실패울 계산시 int형을 int형으로 나눈 (int/int)) 결과는 int이므로 0 혹은 1이 저장되어 오답
        // int 나누기 double형의 결과는 double로 원하는 값 얻을 수 있음
        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;
        // 3 실패율 게산
        for (int i = 0; i <= N; i++) {
            //4 사용자가 0이면 실패율도 0
            if (challenger[i] == 0) {
                fails.put(i, 0.);
            } else {
                // 5 실패율 공식
                fails.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }
        // 실패율 높은 수대로 내림차순 계산
        return fails.entrySet().stream().sorted((o1, o2)
                -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }
}
