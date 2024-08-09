package BaekJ.SetsAndMaps;

import java.util.*;

public class CardNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        HashMap<String, Integer> num = new HashMap<>();

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            num.put(sc.next(), 0);
        }
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            if (num.get(sc.next()) != null) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
