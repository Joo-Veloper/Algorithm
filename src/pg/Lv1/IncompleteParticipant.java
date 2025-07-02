package pg.Lv1;

import java.util.*;

public class IncompleteParticipant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 참가자 수
        sc.nextLine(); // 버퍼 비우기

        String[] participant = new String[n];
        for (int i = 0; i < n; i++) {
            participant[i] = sc.nextLine();
        }

        String[] completion = new String[n - 1];
        for (int i = 0; i < n - 1; i++) {
            completion[i] = sc.nextLine();
        }

        String answer = solution(participant, completion);
        System.out.println(answer);
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }

        return "";
    }
}
