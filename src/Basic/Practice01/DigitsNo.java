package Basic.Practice01;

import java.util.Scanner;

public class DigitsNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int n;
        do {
            System.out.print("정수값");
            n = sc.nextInt();
        } while (n <= 0);
        int no =0;
        while (n > 0) {
            n /= 10;
            no ++;
        }
        System.out.println(" 그 수는 " + no + "입니다.");
    }
}
