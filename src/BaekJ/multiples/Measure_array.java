package BaekJ.multiples;

import java.util.Scanner;

public class Measure_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        int q;

        p = sc.nextInt();
        q = sc.nextInt();
        int[] divisors = new int[p]; // p 이하의 모든 수를 고려할 수 있는 크기
        int count = 0;

        for (int i = 1; i <= p; i++) {
            if (p % i == 0){
                divisors[count++] = i;
            }
        }

        if (count <= q - 1) {
            System.out.println(0);
        } else {
            System.out.println(divisors[q - 1]);
        }
    }
}
