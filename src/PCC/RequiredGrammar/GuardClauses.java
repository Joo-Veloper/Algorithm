package PCC.RequiredGrammar;

import java.util.List;

public class GuardClauses {
    static double calculateAverage(List<Integer> numbers){
        if (numbers == null) {
            return 0;
        }
        if (numbers.isEmpty()){
            return 0;
        }
        int total = numbers.stream().mapToInt(i -> i).sum();
        return (double) total / numbers.size();
    }
    /** 보호 구문은 본격적인 로직을 진행하기 전 예외 처리 코드를 추가 후 기입*/
}
