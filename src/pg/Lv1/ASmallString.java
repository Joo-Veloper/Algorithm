package pg.Lv1;

import java.util.Scanner;

public class ASmallString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String p = sc.next();

        System.out.println(solution(t, p));
    }
    private static int solution(String t, String p) {
        int k = p.length();
        int answer = 0;
        for (int i = 0; i <= t.length() - k; i++) {
            String window = t.substring(i, i + k);
            if (window.compareTo(p) <= 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
