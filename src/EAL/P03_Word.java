package EAL;

import java.util.Scanner;

public class P03_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(soultion(sentence));
    }

    private static String soultion(String sentence) {
        String answer = "";
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > answer.length()) {
                answer = s[i];
            }
        }
        return answer;
    }
}


/* split - 주어진 정규 표현식의 일치하는 문자열을 분할
* ex) -> "I Love Java"	" " (공백 문자)	{ "I" , "Love" , "Java" }*/