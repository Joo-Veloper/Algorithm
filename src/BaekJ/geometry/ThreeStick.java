package BaekJ.geometry;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        if (num[0] + num[1] > num[2]) {
            System.out.println(num[0] + num[1] + num[2]);
        } else {
            System.out.println((num[0] + num[1]) * 2 - 1);
        }

    }
}
