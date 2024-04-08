package PCC.Stack;

import java.util.Scanner;
import java.util.Stack;

/*
* 초단윈로 기록된 주식 가격이 담기 배열 prcies가 매개변수로 주어질 때 가격이 떨어지지 않은 기간은 몇초인지 반환하는 솔루션*/
public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주식 가격의 개수를 입력하세요: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("주식 가격을 차례로 입력하세요:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int[] result = solution(prices);
        System.out.println("각 가격이 떨어지지 않은 기간은 다음과 같습니다:");
        for (int i = 0; i < n; i++) {
            System.out.println(result[i] + " 초");
        }
    }

    public static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < n; i++) {
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