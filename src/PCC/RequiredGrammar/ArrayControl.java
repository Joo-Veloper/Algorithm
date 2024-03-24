package PCC.RequiredGrammar;

import java.util.Arrays;
import java.util.Collections;

public class ArrayControl {
    // 배열의 길이 2 이상 1000이하
    // 각 배열의 데이터 값은 -100,000 이상 100,000 이하
    private static int[] solution(int[] arr){
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

}
