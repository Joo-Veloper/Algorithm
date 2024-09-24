package BaekJ.combination;

import java.util.Scanner;

public class BuildingBridge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) { // t번 반복
            int n = sc.nextInt(); // 서쪽 사이트 개수
            int m = sc.nextInt(); // 동쪽 사이트 개수
            System.out.println(bridge(m, n)); // mCn 계산
        }
    }

    static int bridge(int m, int n) {
        int result = 1;

        for (int i = 0; i < n; i++) {
            result *= (m - i);
            result /= (i + 1);
        }
        return result;
    }
}
