package BCTP.solution.Stack;

import java.util.*;

public class P01_Parenthesis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    private static boolean solution(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] a = str.toCharArray();
        for (char c : a) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() == c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
