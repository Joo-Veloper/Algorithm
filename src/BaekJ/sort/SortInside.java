package BaekJ.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortInside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray();


        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
