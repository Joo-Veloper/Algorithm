package BaekJ.sort;

import java.util.Arrays;
import java.util.Scanner;

public class RepresentativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            a[i] += n;
            sum += n;
        }

        System.out.println(sum / 5);
        Arrays.sort(a);
        System.out.println(a[2]);
        sc.close();
    }
}
