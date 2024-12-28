package EAL;

import java.util.Scanner;

public class P01_Find_A_Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 문자열
        char c = sc.next().charAt(0); // 문자
        System.out.println(soultion(str, c));
    }

    private static int soultion(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                answer++;
            }
        }

        return answer;
    }
}
