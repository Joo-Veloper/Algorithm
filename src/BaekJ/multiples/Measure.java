package BaekJ.multiples;

import java.util.ArrayList;
import java.util.Scanner;

public class Measure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        int q;

        p = sc.nextInt();
        q = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= p; i++) {
            if (p%i == 0){
                list.add(i);
            }
        }

        if (list.size() <= q-1) {
            System.out.println(0);
        }else {
            System.out.println(list.get(q-1));
        }
    }
}
