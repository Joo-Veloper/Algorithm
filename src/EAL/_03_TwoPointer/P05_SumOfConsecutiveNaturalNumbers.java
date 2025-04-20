package EAL._03_TwoPointer;

import java.util.Scanner;

public class P05_SumOfConsecutiveNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(solution(N));
    }

    private static int solution(int n) {
        int sum = 0;
        int left = 1;
        int count = 0;

        for (int i = 1; i < n; i++) {
            sum += i;
            while (sum > n) {  // 1 > 15
                // 숫자가 n을 넘어 갔을때 슬라이딩
                sum -= left++;
            }
            if (sum == n) {
                count++;
            }
        }
        return count;
    }
}