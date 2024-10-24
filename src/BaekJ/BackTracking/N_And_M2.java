package BaekJ.BackTracking;

import java.util.Scanner;

public class N_And_M2 {
    public static int N, M;
    public static int[] sequence;
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        sequence = new int[M];
        visited = new boolean[N + 1];

        backtrack(0,1);
    }

    public static void backtrack(int depth, int start) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(sequence[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sequence[depth] = i;
                backtrack(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}