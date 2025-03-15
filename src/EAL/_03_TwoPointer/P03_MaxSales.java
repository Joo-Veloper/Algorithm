package EAL._03_TwoPointer;

import java.util.Scanner;

public class P03_MaxSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N일
        int n = sc.nextInt();
        // K일
        int k = sc.nextInt();

        // N일 매출 기록
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(solution(n,k,a));
    }

    private static int solution(int n, int k, int[] a) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += a[i];
        }

        answer += sum;

        for (int i = k; i < n; i++) {
            sum+=(a[i]-a[i-k]);
            answer=Math.max(answer, sum);
        }
        return answer;
    }
}
