package pg.Lv1;

import java.util.Scanner;

public class NumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        System.out.println(solution(x, y));
    }

    private static String solution(String x, String y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        // 각 숫자(0~9)가 몇 번 나오는지 배열에 저장
        for (char c : x.toCharArray()) {
            countX[c - '0']++;
        }

        for (char c : y.toCharArray()) {
            countY[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        // 큰 수부터 조합하기 위해 9부터 0까지
        for (int i = 9; i >= 0; i--) {
            int common = Math.min(countX[i], countY[i]);
            for (int j = 0; j < common; j++) {
                sb.append(i);
            }
        }

        // 짝꿍이 없는 경우
        if (sb.length() == 0) {
            return "-1";
        }

        // 짝꿍이 0으로만 이루어진 경우
        if (sb.charAt(0) == '0') {
            return "0";
        }

        // 그 외에는 짝꿍 숫자 반환
        return sb.toString();
    }
}

