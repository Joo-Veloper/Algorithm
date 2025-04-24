package BCTP.solution.Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class P05_PriceOfStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int[] result = solution(prices);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int j = stack.pop();
                answer[j] = i - j;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = n - 1 - j;
        }

        return answer;
    }
}
