package EAL._03_TwoPointer;

import java.util.Scanner;

public class P04_ContinuousPartialSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N개의 수
        int n = sc.nextInt(); //8

        // 특정 숫자의 합이 m
        int m = sc.nextInt(); //6

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(solution(n,m,a));
    }
    private static int solution(int n, int m, int[] a) {
        int answer = 0;
        int sum = 0;
        int left = 0;

        for (int i = 0; i < n; i++) {

            sum += a[i];

            while (sum > m) {
                sum -= a[left++];
            }

            if (sum == m) {
                answer++;
            }
        }
        return answer;
    }

}
/*연속 부분수열
N개의 수로 이루어진 수열이 주어집니다.
이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을
작성하세요.
만약 N=8, M=6이고 수열이 다음과 같다면
1 2 1 3 1 1 1 2
합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
▣ 입력설명
첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
수열의 원소값은 1,000을 넘지 않는 자연수이다.
▣ 출력설명
첫째 줄에 경우의 수를 출력한다.
▣ 입력예제 1
8 6
1 2 1 3 1 1 1 2
▣ 출력예제 1
3*/