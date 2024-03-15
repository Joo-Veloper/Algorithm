package Basic.Practice01;

import java.util.Scanner;

public class Min4 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("최솟값을 구함");
        System.out.print("a 값 :");
        a = sc.nextInt();
        System.out.print("b 값 :");
        b = sc.nextInt();
        System.out.print("c 값 :");
        c = sc.nextInt();
        System.out.print("d 값 :");
        d = sc.nextInt();

        int min = min4(a, b, c, d);
        System.out.println("최솟값 : " + min);

    }
}
