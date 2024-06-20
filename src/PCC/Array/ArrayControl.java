package PCC.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sorted = solution(arr);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] solution(int[] arr) {
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        // 정방향
        // Arrays.sort(result);
        // 역방향
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}
