package PCC.Hash;

import java.util.HashMap;

public class Mart {
    public static void main(String[] args) {
        Mart mart = new Mart();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        int answer = mart.solution(want, number, discount);
        System.out.println(answer);
    }

    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        int answer = 0;

        HashMap<String, Integer> discount10d = new HashMap<>();

        for (int i = 0; i <= discount.length - want.length; i++) {
            discount10d.clear();

            for (int j = i; j < i + want.length; j++) {
                if (wantMap.containsKey(discount[j])) {
                    discount10d.put(discount[j], discount10d.getOrDefault(discount[j], 0) + 1);
                }
            }

            if (discount10d.equals(wantMap)) {
                answer++;
            }
        }
        return answer;
    }
}
