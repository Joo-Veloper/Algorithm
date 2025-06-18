package pg.Lv1;

import java.util.Scanner;

public class CatchingBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wallet = new int[n];
        int[] bill = new int[n];
        for (int i = 0; i < n; i++) {
            wallet[i] = sc.nextInt(); // 가로
        }
        for (int i = 0; i < n; i++) {
            bill[i] = sc.nextInt(); // 세로
        }
        System.out.println(solution(wallet, bill));

    }

    private static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int width = bill[0];
        int height = bill[1];

        while (true) {
            if ((width <= wallet[0] && height <= wallet[1]) || (height <= wallet[0] && width <= wallet[1])) {
                break;
            }
            if (width >= height) {
                width /= 2;
            } else {
                height /= 2;
            }
            answer++;
        }

        return answer;
    }
}
