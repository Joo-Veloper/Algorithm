package BCTP.solution.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Problem2_O_NlogN {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 2, 1, 3, 4})));
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 1, 3, 2, 5, 4})));
    }

    private static int[] solution(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            set.add(num);
        }
        //int형 배열 담아서 변환
        int[] result = new int[set.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = set.pollFirst();
        }
        return result;
    }
}
