package BaekJ.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String wr = sc.nextLine();
            if (wr.equals(".")) {
                break;
            }
            System.out.println(read(wr));
        }
        sc.close();
    }

    private static String read(String wr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < wr.length(); i++) {
            char ch = wr.charAt(i);

            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' ) {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                }
                stack.pop();
            }
            else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                }
                stack.pop();
            }
        }
        return wr;
    }
}
