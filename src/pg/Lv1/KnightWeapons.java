package pg.Lv1;

import java.util.Scanner;

public class KnightWeapons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 기사 단원 ex) 5 => 1{1},2{1 2},3{1 3},4{1 2 4},5{1 5}
        int number = sc.nextInt();

        // limit
        int limit = sc.nextInt();

        // number의 약수 가 공격력
        int power = sc.nextInt();
        System.out.println(solution(number, limit, power));
    }

    private static int solution(int number, int limit, int power) {
       /* int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            // i의 약수 개수
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }
        return answer;*/
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    if (j != i / j) {
                        count++;
                    }
                }
            }
            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }
        return answer;
    }
}
