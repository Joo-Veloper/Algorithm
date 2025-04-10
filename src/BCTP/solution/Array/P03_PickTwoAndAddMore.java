package BCTP.solution.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class P03_PickTwoAndAddMore {
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
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                set.add(arr[i] + arr[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray()  ;
    }
}
