package BaekJ.math1;

import java.util.Scanner;

public class FindDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cross = 1;// 현재 대각선의 번호
        int prev = 0; // 원소수 누적 초기값은 0

        while (true) {
            if (n <= prev + cross) { //prev + cross는 현재 대각선의 총 원소 수를 나타내며 n이 대각선에 속하면 if 가 참이 되어  루프가 종료되고  분수 계산
                if (cross % 2 == 1) { // cross % 2 인 이유는 대각선이 홀수라면 오른쪽 아래에서 위쪽으로 진행
                    System.out.println((cross - (n - prev - 1)) + "/" + (n - prev)); // 분자는 cross-(n - prev - 1) 이고 분모는 n-prev입니다.
                } else {
                    System.out.println((n - prev) + "/" + (cross - (n - prev - 1))); // 대각선이 짝수이면, 왼쪽 위에서 오른쪽 아래로 진행  분자는 n-prv이고 분모는 cross-(n-prev-1)
                }
                break;
            } else {// 그렇지 않다면 prev 에 현재 대각선 원소수 cross를 더하고 cross를 증가 시켜 다음 대각선으로 넘어감
                prev += cross;
                cross++;
            }
        }
    }
}
