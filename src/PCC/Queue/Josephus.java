package PCC.Queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Josephus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people, N:");
        int N = sc.nextInt();
        System.out.println("Enter the number K (every K-th person will be eliminated):");
        int K = sc.nextInt();
        sc.close();

        Solution solution = new Solution();
        int lastPerson = solution.solution(N, K);
        System.out.println("The position of the last person standing is: " + lastPerson);
    }

    static class Solution {
        public int solution(int N, int K) {
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            for (int i = 1; i <= N; i++) {
                deque.addLast(i);
            }

            while (deque.size() > 1) {
                for (int i = 0; i < K - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
                deque.pollFirst();
            }

            return deque.peekFirst();
        }
    }
}
