package PCC.Tree;

import java.util.HashMap;

public class ToothBrush {
    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"sam", "emily", "jaimie", "edward"};
        int[] amount = {2,3,5,4};

        ToothBrush tb = new ToothBrush();
        int[] result = tb.solution(enroll, referral, seller, amount);

        for (int r : result) {
            System.out.printf("[" + r + "]");
        }
    }

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        HashMap<String, String> parent = new HashMap<>();
        for (int i = 0; i < enroll.length; i++) {
            parent.put(enroll[i], referral[i]);
        }

        HashMap<String, Integer> total = new HashMap<>();

        for (int i = 0; i < seller.length; i++) {
            String curName = seller[i];
            int money = amount[i] * 100;

            while (money > 0 && !curName.equals("-")) {
                total.put(curName, total.getOrDefault(curName, 0) + money - (money / 10));
                curName = parent.get(curName);
                money /= 10;
            }
        }

        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = total.getOrDefault(enroll[i], 0);
        }
        return answer;
    }
}
