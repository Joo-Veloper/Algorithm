package BaekJ.combination;

import java.util.Scanner;

public class GreenTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(countParts(n));
    }

    static int countParts(int n) {
        return (n == 1) ? 2 : 2 * countParts(n - 1);
    }
}
