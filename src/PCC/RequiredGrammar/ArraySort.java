package PCC.RequiredGrammar;

import java.util.Arrays;

public class ArraySort {
    private static int[] soultion(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int[] org = {4, 2, 3, 1, 5, 7, 9};
        int[] sorted = soultion(org);
        System.out.println(Arrays.toString(org));
        System.out.println(Arrays.toString(sorted));
    }
}

/** O(NlogN)
 * N은 입력 크기를 나타내며, logN은 로그 함수를 나타냅니다.
 * 로그 함수의 밑(base)은 일반적으로 2를 사용하며,
 * N이 2의 거듭제곱인 경우에는 logN 값이 정수가 됩니다.
 * 예를 들어, N이 8일 때 log(8)는 3이 됩니다.*/
