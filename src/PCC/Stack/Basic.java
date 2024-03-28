package PCC.Stack;

import java.util.ArrayDeque;

public class Basic { // Basic 클래스를 정의합니다.
    private boolean solution(String s) { // 문자열을 입력으로 받아서 괄호의 짝이 맞는지 여부를 판단하는 solution 메서드를 정의합니다.
        ArrayDeque<Character> stack = new ArrayDeque<>(); // 문자(Character)를 저장하기 위한 ArrayDeque 형태의 스택을 생성합니다.

        char[] a = s.toCharArray(); // 입력된 문자열을 문자 배열로 변환합니다.
        for (char c : a) { // 배열 a의 각 문자 c에 대해 반복합니다.
            if (c == '(') { // 만약 c가 여는 괄호인 '('이면
                stack.push(c); // 스택에 해당 괄호를 push합니다.
            } else { // 그렇지 않으면(닫는 괄호인 경우)
                // 스택이 비어있거나 pop한 값이 현재 문자 c와 짝이 아닌 경우(예: ')'가 '('와 짝이 아님)에는 false를 반환하고 메서드를 종료합니다.
                if (stack.isEmpty() || stack.pop() == c) {
                    return false;
                }
            }
        }
        // 문자열을 모두 처리한 후에도 스택이 비어있다면 괄호의 짝이 맞으므로 true를 반환합니다. 그렇지 않다면(여는 괄호가 남아있다면) false를 반환합니다.
        return stack.isEmpty();
    }
}
