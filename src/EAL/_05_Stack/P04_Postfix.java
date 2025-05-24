package EAL._05_Stack;

import java.util.Scanner;
import java.util.Stack;

public class P04_Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }

    private static int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int rt = stack.pop();
                int lf = stack.pop();
                if(c=='+') {
                    stack.push(lf + rt);
                } else if(c=='-') {
                    stack.push(lf - rt);
                } else if(c=='*') {
                    stack.push(lf * rt);
                } else if(c=='/') {
                    stack.push(lf / rt);
                }
            }
        }
        answer=stack.get(0);
        return answer;
    }
}
