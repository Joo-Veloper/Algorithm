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
                memo[n+1] = memo[n] + n + "\n" + memo[n-1]; // momo 배열의 n+1 인덱스에 새로운 값을 저장합니다. 여기서 memo[n] + n + "\n" + memo[n-1]은 이전값 memo[n]에 n과 개행문자 ("\n")그리고 momo[n-1]을 합친 문자열을 의미합니다.
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
