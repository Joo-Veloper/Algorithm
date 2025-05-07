package EAL._05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class P02_RemoveParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while(stack.pop() != '(');
            }
            else{
                stack.push(x);
            }
        }
        for (char c : stack) {
            answer += c;
        }

        return answer;
    }
}
