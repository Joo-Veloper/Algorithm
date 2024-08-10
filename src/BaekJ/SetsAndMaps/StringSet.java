package BaekJ.SetsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(sc.nextLine(), 0);
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (map.containsKey(sc.nextLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}
