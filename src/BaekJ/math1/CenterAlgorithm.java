package BaekJ.math1;

import java.util.Scanner;

public class CenterAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int point = 2;

        for (int i = 0; i < n; i++) {
            point = point * 2 - 1;
        }
        int total = point * point;

        System.out.println(total);
    }
}
