package BaekJ.deep;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double aa = 0;
        double point = 0;

        for (int i = 0; i < 20; i++) {
            String title = sc.next();
            double a = sc.nextDouble();
            String b = sc.next();

            if (b.equals("A+")) {
                aa += a * 4.5;
                point += a;
            } else if (b.equals("A0")) {
                aa += a * 4.0;
                point += a;
            } else if (b.equals("B+")) {
                aa += a * 3.5;
                point += a;
            } else if (b.equals("B0")) {
                aa += a * 3.0;
                point += a;
            } else if (b.equals("C+")) {
                aa += a * 2.5;
                point += a;
            } else if (b.equals("C0")) {
                aa += a * 2.0;
                point += a;
            } else if (b.equals("D+")) {
                aa += a * 1.5;
                point += a;
            } else if (b.equals("D0")) {
                aa += a * 1.0;
                point += a;
            } else if (b.equals("F")) {
                aa += a * 0.0;
                point += a;
            }
        }
        System.out.printf("%.6f", aa/ point);
    }
}
