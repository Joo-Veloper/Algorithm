package Basic.Chap05;

import java.util.Scanner;

public class Recur2 {
    static void recur(int n) {
        if(n>0) { // n이 0보다 크면 재귀호출됩니다.
            recur(n-2);// 루프 내부에 recure(n-2)가 호출되며, n의 값을 각 재귀호출마다 2씩 줄입니다.
            System.out.println(n);
            recur(n-1);//n의 값을 각 재귀호출마다 1씩 줄입니다.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요");
        int x= sc.nextInt();

        recur(x);
    }
}
