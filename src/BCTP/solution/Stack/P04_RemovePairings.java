package BCTP.solution.Stack;

import java.util.Scanner;
import java.util.Stack;

public class P04_RemovePairings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
