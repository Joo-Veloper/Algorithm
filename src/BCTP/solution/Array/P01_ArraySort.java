package BCTP.solution.Array;

import java.util.Arrays;
import java.util.Scanner;

public class P01_ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        int[] answer = arr;

        Arrays.sort(arr);

        return answer;
    }


}
