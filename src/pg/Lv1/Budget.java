package pg.Lv1;

import java.util.Arrays;
import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int budget = sc.nextInt();
        System.out.println(solution(d, budget));
    }

    private static int solution(int[] d, int budget) {
        Arrays.sort(d); // 순차 계산을 위해 정렬
        int result = 0;
        int count = 0;

        for (int i = 0; i < d.length; i++) {
            result += d[i];
            if (result <= budget) {
                count++;
            }
        }
        return count;
    }
}
