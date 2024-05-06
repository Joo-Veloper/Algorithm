package PCC.Tree;


import java.util.Arrays;
import java.util.HashMap;

public class MultiToothbrush {
    public static void main(String[] args) {
        MultiToothbrush multiToothbrush = new MultiToothbrush();
        String[] enroll = {"john", "marry", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "marry", "edward", "marry", "marry", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "marry"};
        int[] amount = {12, 4, 2, 5, 10};
        int[] result = multiToothbrush.solution(enroll, referral, seller, amount);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        HashMap<String, String> parent = new HashMap<>();
        for (int i = 0; i < enroll.length; i++) {
            parent.put(enroll[i], referral[i].equals("-") ? "-" : referral[i]);
        }
        HashMap<String, Integer> total = new HashMap<>();

        for (int i = 0; i < seller.length; i++) {
            String curName = seller[i];
            int money = amount[i] * 100;
            while (!curName.equals("-") && money > 0) {
                int give = money / 10;
                total.put(curName, total.getOrDefault(curName, 0) + money - give);
                curName = parent.get(curName);
                money = give;
                if (money == 0) break;
            }
        }
        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = total.getOrDefault(enroll[i], 0);
        }
        return answer;
    }
}
