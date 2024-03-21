package pg;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Solution {

    public static int solution(String[] birthdays) {
        int n = birthdays.length;
        boolean[] isWeekend = new boolean[n];
        int[][] days = new int[n][2]; // To store month and day for easier calculation
        int gifts = 0;

        // Preparing the birthdays and checking weekends
        for (int i = 0; i < n; i++) {
            int month = Integer.parseInt(birthdays[i].substring(0, 2));
            int day = Integer.parseInt(birthdays[i].substring(2, 4));
            days[i][0] = month;
            days[i][1] = day;

            LocalDate date = LocalDate.of(2023, month, day);
            int dayOfWeek = date.getDayOfWeek().getValue();
            isWeekend[i] = (dayOfWeek == 6 || dayOfWeek == 7); // 6 = Saturday, 7 = Sunday
        }

        // Calculating gifts
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && !isWeekend[j]) {
                    int diff = Math.abs(daysBetween(days[i], days[j]));
                    if (diff >= 5) {
                        gifts++;
                    }
                }
            }
        }

        return gifts;
    }

    private static int daysBetween(int[] date1, int[] date2) {
        LocalDate d1 = LocalDate.of(2023, date1[0], date1[1]);
        LocalDate d2 = LocalDate.of(2023, date2[0], date2[1]);
        int diff = (int) ChronoUnit.DAYS.between(d1, d2);

        // Adjusting for circular difference
        if (Math.abs(diff) > 182) {
            diff = 365 - Math.abs(diff);
        }
        return diff;
    }

    public static void main(String[] args) {
        String[] birthdays1 = {"0107", "0110", "0201"};
        System.out.println(solution(birthdays1)); // 3

        String[] birthdays2 = {"0315", "0301", "0625", "1230", "0309", "1116", "1216", "0128", "0621", "0510"};
        System.out.println(solution(birthdays2)); // 53

        String[] birthdays3 = {"0106", "0110", "0111"};
        System.out.println(solution(birthdays3)); // 2
    }
}

