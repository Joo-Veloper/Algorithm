package Basic.Practice01;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a값을 입력하세요");
        int a = sc.nextInt();
        int b;
        while (true) {
            System.out.print("b의 값 :");
            b=sc.nextInt();
            if(b>a) break;
            System.out.println("a보다 큰 값을 입력하세요");
        }

        System.out.println("b - a는 " + (b - a) + "입니다.");
    }
}
