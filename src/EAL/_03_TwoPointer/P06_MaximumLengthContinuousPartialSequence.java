package EAL._03_TwoPointer;

import java.util.Scanner;

public class P06_MaximumLengthContinuousPartialSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }

    private static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int count = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {

            if (arr[right] == 0) {
                count++;
            }

            while (count > k) {
                if (arr[left] == 0) {
                    count--;
                }
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }
}
