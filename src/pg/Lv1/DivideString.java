package pg.Lv1;

import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int count = 0;
        int index = 0;

        while (index < s.length()) {
            char x = s.charAt(index);
            int countX = 0;
            int countOther = 0;

            while (index < s.length()) {
                if (s.charAt(index) == x) {
                    countX++;
                } else {
                    countOther++;
                }
                index++;

                if (countX == countOther) {
                    break;
                }
            }
            count++;
        }

        return count;
    }
}
