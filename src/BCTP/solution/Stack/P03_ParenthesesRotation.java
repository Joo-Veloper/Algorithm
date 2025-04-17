package BCTP.solution.Stack;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class P03_ParenthesesRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        int n = s.length();
        s += s;
        int answer = 0;

        A: for (int i = 0; i < n; i++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();

            for (int j = i; j < i + n; j++) {
                char c = s.charAt(j);
                if (map.containsKey(c)) {
                    if (stack.isEmpty() || stack.pop() != map.get(c)) {
                        continue A;
                    }
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
