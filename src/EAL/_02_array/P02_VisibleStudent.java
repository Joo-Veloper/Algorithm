package EAL._02_array;

import java.util.Scanner;

public class P02_VisibleStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(solution(N, heights));
    }

    private static int solution(int n, int[] heights) {
        int count = 1;
        int max = heights[0];
          for (int i = 0; i < n; i++) {
            if (heights[i] > max) {
                count++;
                max = heights[i];
            }
        }
        return count;
    }
}
