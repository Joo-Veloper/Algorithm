package BaekJ.stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt(); // 명령의 수

        for (int i = 0; i < N; i++) {
            int command = sc.nextInt();

            switch (command) {
                case 1: // 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
                    int X = sc.nextInt();
                    stack.push(X);
                    break;

                case 2: //스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                    if (stack.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;

                case 3: // 스택에 들어있는 정수의 개수를 출력한다.
                    sb.append(stack.size()).append("\n");
                    break;

                case 4: // 스택이 비어있으면 1, 아니면 0을 출력한다.
                    if (stack.isEmpty()) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;

                case 5: // 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                    if (stack.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
