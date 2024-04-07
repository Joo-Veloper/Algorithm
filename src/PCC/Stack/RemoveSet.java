package PCC.Stack;


/* 알파벳 소문자로 구성된 문자열에서 같은 알파벳이 2개 붙어 있는 짝
 * 짝을 찾은 다음에는 그 둘을 제거한 뒤 앞뒤로 문자열을 이어 붙입니다. 이과정을 반복해서 문자열을 모두 제거한다면
 * 짝찌어 제거하기가 종료됩니다. 문자열 S가 주어졌을 때 짝찌어 제거하기를 성공적으로 수행할 수 있는지
 * 반환하는 함수를 완성*/
import java.util.Scanner;
import java.util.Stack;

public class RemoveSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int result = removeAdjacentPairs(inputString);
        System.out.println(result);
    }

    public static int removeAdjacentPairs(String s) {
        // 문자를 저장할 스택을 생성합니다.
        Stack<Character> stack = new Stack<>();
        // 입력받은 문자열 s의 각 문자를 순회합니다
        for (int i = 0; i < s.length(); i++) {
            // 현재 문자를 c에 할당합니다.
            char c = s.charAt(i);
            // 스택이 비어있지 않고, 스택의 맨 위에 있는 문자가 현재 문자(c)와 동일하다면,
            if (!stack.isEmpty() && stack.peek() == c) {
                // 스택의 맨 위에 있는 문자를 제거합니다.
                stack.pop();
            } else {
                // 그렇지 않다면, 현재 문자를 스택에 추가합니다.
                stack.push(c);
            }
        }
        // 반복문이 종료된 후, 스택이 비어있다면 모든 문자가 제거된 것이므로 1을 반환합니다.
        // 스택에 문자가 남아있다면, 일부 문자가 제거되지 않은 것이므로 0을 반환합니다.
        return stack.isEmpty() ? 1 : 0;
    }
}

