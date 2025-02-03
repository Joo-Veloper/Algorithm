package EAL._02_array;

import java.util.Scanner;

public class P08_GettingRanked {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int[] ranks = Solution(n, scores);
        for (int rank : ranks) {
            System.out.print(rank + " ");
        }
    }

    private static int[] Solution(int n, int[] scores) {
        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            ranks[i] = 1;
            for (int j = 0; j < n; j++) {
                if (scores[j] > scores[i]) {
                    ranks[i]++;
                }
            }
        }
        return ranks;
    }
}