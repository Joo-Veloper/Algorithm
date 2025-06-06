package pg.Lv1;

import java.util.Scanner;

public class TwentySixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();// 월
        int b = sc.nextInt();// 일

        System.out.println(solution(a, b));
    }

    private static String solution(int a, int b) {
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int totalDays = 0;
        for (int i = 0; i < a-1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += (b - 1);

        return daysOfWeek[totalDays % 7];
    }
}
