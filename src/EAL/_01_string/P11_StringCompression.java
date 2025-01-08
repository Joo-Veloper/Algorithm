package EAL._01_string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class P11_StringCompression {
    private static Logger log = Logger.getGlobal();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }


    private static String solution(String str) {
        String answer = "";
        char[] charArrays = str.toCharArray();
        int count = 1;

        for (int i = 0; i < charArrays.length; i++) {
            if (i < charArrays.length - 1 && charArrays[i] == charArrays[i + 1]) {
                count++;
                log.info("charArrays" + Arrays.toString(answer.toCharArray()));
            } else {
                // 만약 현재 문자가 한개 만 있을때
                answer += charArrays[i];
                if (count > 1) {
                    answer += count;
                    log.info("if one str" + Arrays.toString(answer.toCharArray()));
                }
                count = 1;
                log.info("count + 1" + Arrays.toString(answer.toCharArray()));
            }
        }
        return answer;
    }
}