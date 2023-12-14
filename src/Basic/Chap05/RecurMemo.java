package Basic.Chap05;

import java.util.Scanner;

public class RecurMemo {
    static String[] memo;

    static void recur(int n) {
        if (memo[n + 1] != null){
            System.out.print(memo[n+1]);
        }
        else {
            if(n>0) {
                recur(n-1);
                System.out.println(n);
                recur(n-2);
                memo[n+1] = memo[n] + n + "\n" + memo[n-1];
            }
            else {
                memo[n+1] = "";
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("정수 입력");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        memo = new String[x + 2];
        recur(x);
    }
}
