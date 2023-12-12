package Basic.Chap05;

import java.util.Scanner;

public class Recursion {
    static int factorial(int n) {
        int fact = 1;
        while (n > 1) {
            fact *= n--;
        }return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
