package BaekJ.geometry;

import java.util.HashSet;
import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        HashSet<Integer> A = new HashSet<>(); // 차집합
        HashSet<Integer> B = new HashSet<>(); // 합집합

        int result = 0;

        for (int i = 0; i < a; i++) {
            A.add(sc.nextInt());
        }
        for (int i = 0; i < b; i++) {
            B.add(sc.nextInt());
        }

        for (Object i : A.toArray()) {
            if (!B.contains(i)) {
                result++;
            }
        }
        for (Object i : B.toArray()) {
            if (!A.contains(i)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
