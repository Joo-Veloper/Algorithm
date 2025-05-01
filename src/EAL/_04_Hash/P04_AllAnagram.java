package EAL._04_Hash;

import java.util.HashMap;
import java.util.Scanner;

public class P04_AllAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(solution(a, b));
    }

    private static int solution(String a, String b) {
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        int answer = 0;
        int left = 0;
        int L = b.length() - 1;

        for (char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < L; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }

        for (int right = L; right < a.length(); right++) {
            am.put(a.charAt(right), am.getOrDefault(a.charAt(right), 0) + 1);
            if (am.equals(bm)) {
                answer++;
            }
            am.put(a.charAt(left), am.get(a.charAt(left)) - 1);

            if (am.get(a.charAt(left)) == 0) {
                am.remove(a.charAt(left));
            }
            left++;
        }

        return answer;
    }
}
