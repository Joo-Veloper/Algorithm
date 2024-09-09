package BaekJ.stack;

import java.util.Scanner;
import java.util.Stack;

public class Dreamy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] line = new int[n];

        for (int j = 0; j < line.length; j++) {
            line[j] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int expected = 1;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() == expected) {
                stack.pop();
                expected++;
            }
            if (line[i] == expected) {
                expected++;
            } else {
                stack.push(line[i]);
            }
        }
        while (!stack.isEmpty() && stack.peek() == expected) {
            stack.pop();
            expected++;
        }

        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
