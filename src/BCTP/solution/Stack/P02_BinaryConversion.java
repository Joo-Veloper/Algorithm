package BCTP.solution.Stack;

import java.util.Scanner;
import java.util.Stack;

public class P02_BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution(n));

    }

    /**
     * String binary = Integer.toBinaryString(n);
     * <p>
     * return binary;
     */

    private static String solution(int n) {

        Stack<Integer> stack = new Stack<>();

        while (n > 0) {
            int bc = n % 2;
            stack.push(bc);
            n /= 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
