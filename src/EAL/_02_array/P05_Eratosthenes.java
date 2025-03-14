package EAL._02_array;

import java.util.Scanner;

public class P05_Eratosthenes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
            System.out.println(solution(N));
    }

    private static int solution(int n) {
        int count = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                count++;
                for (int j = i; j <= n; j+=i) {
                    ch[j] = 1;
                }
            }
        }
        return count;
    }
}
/*
    소수(에라토스테네스 체)
    자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
    만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
    제한시간은 1초입니다.

        ▣ 입력설명
        첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

        ▣ 출력설명
        첫 줄에 소수의 개수를 출력합니다.

        ▣ 입력예제 1
        20

        ▣ 출력예제 1
        8
*/
