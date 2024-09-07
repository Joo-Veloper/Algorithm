package BaekJ.stack;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String ps = sc.nextLine();
            System.out.println(vps(ps));
        }
        sc.close();
    }

    public static String vps(String ps) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ps.length(); i++) {
            char ch = ps.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
