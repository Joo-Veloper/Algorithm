package EAL._02_array;

import java.util.Scanner;

public class P12_Mentoring {
    public static void main(String[] args) {
        //입력:
        Scanner sc = new Scanner(System.in);

        //  N (학생 수), M (테스트 횟수)
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(N, M, arr));
    }

    private static int solution(int N, int M, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= N; i++) { // 멘토 후보
            for (int j = 1; j <= N; j++) { // 멘티 후보
                int count = 0;
                for (int k = 0; k < M; k++) { // 테스트
                    int pi = 0, pj = 0;
                    for (int s = 0; s < N; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) {
                        count++;
                    }

                }
                if (count == M) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
