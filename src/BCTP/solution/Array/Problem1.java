package BCTP.solution.Array;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] org = {4, 2, 3, 1, 5};
        int[] sorted = solution(org);
        System.out.println(Arrays.toString(org));
        System.out.println(Arrays.toString(sorted));

        System.out.println(Arrays.toString(solution(new int[]{1, -5, 2, 4, 3})));
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 1, 3, 2, 5, 4})));
        System.out.println(Arrays.toString(solution(new int[]{6, 1, 7})));
    }

    // 정렬
    /*private static int[] solution(int[] arrs) {
        Arrays.sort(arrs);
        return arrs;
    }*/

    // clone method
    /*private static int[] solution(int[] arrs) {
        int[] clone = arrs.clone();
        Arrays.sort(clone);
        return clone;
    }*/

    // 원본 배열로 부터 새로운 배열을 복사해서 사용해야 되는 상황에서 clone()을 사용
    private static int[] solution(int[] arrs) {
        int[] clone = arrs;
        Arrays.sort(clone);
        return clone;
    }
}
