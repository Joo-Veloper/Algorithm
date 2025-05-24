package revise;

import java.util.Arrays;
import java.util.Scanner;

public class Remind4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int t = 1; t <= testCase; t++) {
            int n = sc.nextInt(); // 정답 코드 수
            int m = sc.nextInt(); // 느린 코드 수

            int[] correct = new int[n];
            int[] slow = new int[m];

            for (int i = 0; i < n; i++) {
                correct[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                slow[i] = sc.nextInt();
            }

            int maxCorrect = Arrays.stream(correct).max().getAsInt();
            int minSlow = Arrays.stream(slow).min().getAsInt();

            int result = -1;

            // 가능한 시간 제한은 maxCorrect 이상 minSlow 미만
            for (int T = maxCorrect; T < minSlow; T++) {
                boolean cond1 = true;
                boolean cond2 = true;
                boolean cond3 = false;

                // 조건 1: 모든 정답 코드 ≤ T
                for (int time : correct) {
                    if (time > T) {
                        cond1 = false;
                        break;
                    }
                }

                // 조건 2: 모든 느린 코드 > T
                for (int time : slow) {
                    if (time <= T) {
                        cond2 = false;
                        break;
                    }
                }

                // 조건 3: 정답 코드 중 하나라도 (2 * 실행 시간 ≤ T)
                for (int time : correct) {
                    if (time * 2 <= T) {
                        cond3 = true;
                        break;
                    }
                }

                if (cond1 && cond2 && cond3) {
                    result = T;
                    break; // 최소값 찾았으므로 종료
                }
            }

            System.out.println("#" + t + " " + result);
        }

        sc.close();
    }
}

