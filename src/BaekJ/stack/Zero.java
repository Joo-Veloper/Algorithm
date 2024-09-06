package BaekJ.stack;

import java.util.Scanner;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        int sum = 0;

        for(int o : stack) {
            sum += o;
        }
        System.out.println(sum);
    }
}
