package EAL._05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class p05_IronStick {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String stick = sc.next();

        System.out.println(solution(stick));
    }

    private static int solution(String stick) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < stick.length(); i++) {
            if (stick.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (stick.charAt(i - 1) == '(') {
                    count += stack.size();
                } else {
                    count++;
                }
            }
        }
        return count;
    }
}
