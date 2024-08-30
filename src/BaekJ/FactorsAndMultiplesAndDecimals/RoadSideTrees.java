package BaekJ.FactorsAndMultiplesAndDecimals;

import java.util.Scanner;

public class RoadSideTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tree = sc.nextInt(); // 총 가로수 수

        int[] arr = new int[tree];

        // 가로수 위치 입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 간격 계산
        int[] gaps = new int[tree - 1];
        for (int i = 0; i < tree - 1; i++) {
            gaps[i] = arr[i + 1] - arr[i];
        }

        // 모든 간격의 최대 공약수 계산
        int gcdValue = gaps[0];
        for (int i = 1; i < gaps.length; i++) {
            gcdValue = gcd(gcdValue, gaps[i]);
        }

        // 추가해야 할 나무의 수 계산
        int treesToAdd = 0;
        for (int gap : gaps) {
            treesToAdd += (gap / gcdValue) - 1;
        }

        // 결과 출력
        System.out.println(treesToAdd);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
