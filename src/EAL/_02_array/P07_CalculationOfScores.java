package EAL._02_array;

import java.util.Scanner;

public class P07_CalculationOfScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 총 문제 수
        int N = sc.nextInt();
        // 채점 배열
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = sc.nextInt();
        }
        System.out.println(solution(N, result));
    }

    private static int solution(int n, int[] result) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (result[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }
        return answer;
    }
}
