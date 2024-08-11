package BaekJ.SetsAndMaps;

import java.util.*;

public class Office {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String state = sc.next();

            if (map.containsKey(name)) {
                map.remove(name);
            }else{
                map.put(name, state);
            }
        }
        List<String> peopleInOffice = new ArrayList<>(map.keySet());
        Collections.sort(peopleInOffice, Collections.reverseOrder());

        for (String name : peopleInOffice) {
            System.out.println(name);
        }
    }
}
