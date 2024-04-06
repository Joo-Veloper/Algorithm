package PCC.Stack;

import java.util.Scanner;
import java.util.Stack;

/* 10진수를 2진수로 변환 */
public class NumChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = Solution.solution(decimal);
        System.out.println("Binary representation: " + binary);
    }
}

class Solution {
    public static String solution(int decimal) {
        // Check for the special case of 0 explicitly
        if (decimal == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();
        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
