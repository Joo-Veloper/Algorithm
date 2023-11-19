package Basic.chap01;

import java.util.Scanner;

public class gauss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~10까지의 합을 구합니다.");
        System.out.println("n값 : ");
        int n = sc.nextInt();
        
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += i * 5;
        }
        System.out.println( "1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
