package BaekJ.geometry;

import java.util.Scanner;

public class EscapeRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int w;
        int h;
        int x_min;
        int y_min;

        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();

        x_min = Math.min(x, w - x);
        y_min = Math.min(y, h - y);

        System.out.println(Math.min(x_min, y_min));
    }
}
