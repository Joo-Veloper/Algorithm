package Basic.Chap05;

import java.util.Scanner;

public class RecurX {
    static void recur(int n){
        while (n>0){
            recur(n-1);
            System.out.println(n);
            n = n - 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int x = sc.nextInt();

        recur(x);
    }
}
