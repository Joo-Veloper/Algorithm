package PCC.RequiredGrammar;

import java.util.HashSet;

public class TwoPickPlus {
    public int[] solution(int[] numbers) {
        // 중복값 제거
        HashSet<Integer> set = new HashSet<>();
        // 모든 경우의수 반복문
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        TwoPickPlus twoPickPlus = new TwoPickPlus();
        int[] numbers = {2, 1, 3, 4, 1};
        int[] result = twoPickPlus.solution(numbers);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
