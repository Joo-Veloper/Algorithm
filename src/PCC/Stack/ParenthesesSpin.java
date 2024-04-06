package PCC.Stack;


import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

/*(), [], {} 모두 올바른 괄호 문자열
* A 가 올바른 괄호 문자열이 면 (A), [A], {A}도 올바른 괄호 문자열
*  [] 가 올바른 괄호 문자열이므로 ([])도 올바른 괄호 문자열 입니다.
* 만약 A,B가 올바른 괄호 문자열이므로 "{} ([])도 올바른 괄호 문자열입니다.
* 대괄호 중괄호 그리고 소괄호로 이루어진 문자열  s가 매개변수로 주어집니다. 이 s를 왼쪽으로
* x(0 <= x <(s의 길이)) 칸만큼 회전시켰을때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 반환하는
* solution() 함수를 완성*/
public class ParenthesesSpin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = solution(s);
        System.out.println("Number of rotations to make the string valid: " + result);
    }

    public static int solution(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        int n = s.length();
        s += s;
        int answer = 0;

        AA: for (int i = 0; i < n; i++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for (int j = 0; j < i + n; j++) {
                char c = s.charAt(j);

                if (!map.containsKey(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c))) {
                        continue AA;
                    }
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}