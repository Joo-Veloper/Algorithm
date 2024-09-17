package BaekJ.stack;

import java.util.*;

public class Deck2 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    int frontValue = sc.nextInt();
                    deque.addFirst(frontValue);
                    break;
                case 2:
                    int backValue = sc.nextInt();
                    deque.addLast(backValue);
                    break;
                case 3:
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.pollFirst()).append("\n");
                    }
                    break;
                case 4:
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.pollLast()).append("\n");
                    }
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    if (deque.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case 7:
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.peekFirst()).append("\n");
                    }
                    break;
                case 8:
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.print(sb.toString());
        sc.close();
    }
}
