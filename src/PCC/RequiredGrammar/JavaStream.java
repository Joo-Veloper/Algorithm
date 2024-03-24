package PCC.RequiredGrammar;

import java.util.Collections;
import java.util.TreeSet;

public class JavaStream {
    public static int[] solution(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = set.pollFirst();
        }
        return result;
    }
}
/**
 * Stream -> data flow
 * Stream은 데이터의 소스를 추상화하고 데이터를 다루는데 유용한 메서드를 정의
 * 배열또는 컬렉션을 스트림으로 반환하면 for문 등의 반복문을 사용하지 않고 컬렉션의 데이터를 배열에 담아 반환하거나 특정 조건에 따라 필터링하는 등
 * 코드의 양을 줄이고 가독성 향상이 가능
 *
 * Stream을 사용해 O(N)에 해결할 수 있는 문제를 for문과 같은 반복문으로 해경하며 distinct 메서드를 사용하지 않고 반복문을 이용해 O(n2)으로 풀면
 * 시간 초과 발생할 수 있음
 */