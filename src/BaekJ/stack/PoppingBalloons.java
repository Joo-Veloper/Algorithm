package BaekJ.stack;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PoppingBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 풍선의 번호와 값을 저장할 Deque
        Deque<int[]> deque = new ArrayDeque<>();

        // Deque에 풍선 번호와 종이에 적힌 값을 저장
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            deque.add(new int[]{i + 1, value}); // {풍선 번호, 이동 값}
        }

        StringBuilder result = new StringBuilder();

        // 첫 번째 풍선은 터뜨리고 시작
        int[] current = deque.pollFirst();
        result.append(current[0]).append(" ");
        int move = current[1];

        while (!deque.isEmpty()) {
            if (move > 0) {
                // 오른쪽으로 이동 (move-1)번
                for (int i = 1; i < move; i++) {
                    deque.addLast(deque.pollFirst());
                }
                // 이동 후 풍선을 터뜨림
                current = deque.pollFirst();
            } else {
                // 왼쪽으로 이동 (-move)번
                for (int i = 0; i < -move; i++) {
                    deque.addFirst(deque.pollLast());
                }
                // 이동 후 풍선을 터뜨림
                current = deque.pollFirst();
            }

            result.append(current[0]).append(" ");
            move = current[1];
        }

        System.out.println(result.toString().trim());
    }
}


