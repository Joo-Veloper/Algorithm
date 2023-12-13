package Basic.Chap05;

import java.util.Scanner;

public class Recur {
    static void recur(int n) {
        if (n > 0) {
            recur(n-1); // recur메소드를 n-1로 호출합니다. 이 단계에서 n을 1만큼 감소시켜 재귀 시작하빈다.
            System.out.println(n); // 이후 실해되지만 두번째 재귀 호출(recure(n-2))이전에 실행됩니다.
            recur(n - 2); // recure(n-2_ : n-2 로 또 다른 재귀호출을 시작합니다. 이단계는 재귀를 더 나아갑니다.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요");
        int x = sc. nextInt();

        recur(x);
    }
}
