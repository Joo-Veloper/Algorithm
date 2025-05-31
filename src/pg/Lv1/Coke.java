package pg.Lv1;

import java.util.Scanner;

public class Coke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 콜라를 받기 위해 마트에 주어야하는 병 수
        int a = sc.nextInt();
        // a 병 줄때 받을수 있는 콜라 수
        int b = sc.nextInt();
        // 내가 가지고 있는 빈 병 수
        int n = sc.nextInt();

        System.out.println(solution(a, b, n));
    }

    private static int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int count = (n / a) * 1;
            answer += count;
            n = (n % a) + count;
        }
        return answer;

    }
}