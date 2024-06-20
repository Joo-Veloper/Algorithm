package PCC.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int[] sorted = solution(arr);
    System.out.println("Sorted array: " + Arrays.toString(sorted));
}

    private static int[] solution(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }
}
