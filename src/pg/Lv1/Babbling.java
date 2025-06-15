package pg.Lv1;

import java.util.Scanner;

public class Babbling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] babbling = new String[n];
        for (int i = 0; i < n; i++) {
            babbling[i] = sc.nextLine();
        }
        System.out.println(solution(babbling));
    }

    private static int solution(String[] babbling) {
        String[] canSpeak = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (int i = 0; i < babbling.length; i++) {
            boolean matchedSingle = false;

            // 1. 단일 발음만 있는 경우 체크
            for (int j = 0; j < canSpeak.length; j++) {
                if (babbling[i].equals(canSpeak[j])) {
                    count++;
                    matchedSingle = true;
                    break;
                }
            }

            if (matchedSingle) {
                continue;
            }

            // 2. 여러 발음 조합된 경우 처리
            String word = babbling[i];
            String prev = "";
            boolean isValid = true;

            while (!word.isEmpty()) {
                boolean matched = false;
                for (int j = 0; j < canSpeak.length; j++) {
                    String speak = canSpeak[j];
                    if (word.startsWith(speak) && !speak.equals(prev)) {
                        word = word.substring(speak.length());
                        prev = speak;
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                count++;
            }
        }

        return count;
    }
}
