package PCC.Hash;

import java.util.*;

public class MenuR {
    private static HashMap<Integer, HashMap<String, Integer>> courseMap;

    public static void main(String[] args) {

        MenuR menuR = new MenuR();
        String[] orders = {"XYZ", "XWY", "WXA"};
        int[] course = {2, 3, 4};
        String[] result = menuR.solution(orders, course);
        for (String string : result) {
            System.out.println(string);
        }
    }
    private String[] solution(String[] orders, int[] course) {
        courseMap = new HashMap<>();
        for (int i : course) {
            courseMap.put(i, new HashMap<>());
        }
        for (String order : orders) {
            char[] orderArray = order.toCharArray();
            Arrays.sort(orderArray);
            combinations(0, orderArray, "");
        }
        ArrayList<String> answer = new ArrayList<>();

        for (HashMap<String, Integer> count : courseMap.values()) {
            count.values()
                    .stream()
                    .max(Comparator.comparing( o -> o))
                    .ifPresent(cnt -> count.entrySet()
                            .stream()
                            .filter(entry -> cnt.equals(entry.getValue())&& cnt>1)
                            .forEach(entry -> answer.add(entry.getKey())));
        }
        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }

    public static void combinations(int idx, char[] order, String result) {
        if (courseMap.containsKey(result.length())) {
            HashMap<String, Integer> map = courseMap.get(result.length());
            map.put(result, map.getOrDefault(result, 0) + 1); // Increment count correctly
        }
        for (int i = idx; i < order.length; i++) {
            combinations(i + 1, order, result + order[i]);
        }
    }
}
