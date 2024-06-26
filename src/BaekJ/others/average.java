package BaekJ.others;

import java.util.*;
/*
* 문제
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
*  이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
* 정답과 출력값의 절대/상대 오차는 10-3이하이면 정답이다.*/
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int N = sc.nextInt();

        // 학생수
        for(int i = 0 ; i < N ; i++) {
            int n = sc.nextInt();
            arr = new int[n];
            double sum = 0;
            System.out.println(sum);
            // 점수를 순차적 들어감(학생 점수 입력 및 환산)
            for(int j = 0 ; j < n ; j++) {
                int grade = sc.nextInt();
                arr[j] = grade;
                sum += grade;
            }
            //평균을 넘는 학생수
            double avg = (sum / n) ;
            double count = 0;

            for(int k = 0 ; k < n ; k++) {
                if(arr[k] > avg) {
                    count++;
                }
            }
            // 출력
            System.out.printf("%.3f%%\n",(count/n)*100);
        }

        sc.close();
    }
}
