package EAL._01_string;

import java.util.Scanner;

public class P09_ExtractOnlyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        String answer = "";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                answer += charArray[i];
            }
        }
        return Integer.parseInt(answer);
    }
}
