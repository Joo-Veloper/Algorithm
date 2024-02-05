package Basic.Chap01;

import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("1부터 n까지의 합을 구합니다.");

        do{
            System.out.print("n 값: ");
            n = sc.nextInt();
        }while (n<=0);
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;

            System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다.");
        }
    }
}
