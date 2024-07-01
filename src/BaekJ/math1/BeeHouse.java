package BaekJ.math1;

import java.util.Scanner;

public class BeeHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        if (n == 1) {
            count = 1;
        }else{
            while (n > 1) {
                n = n - (6 * count);
                count++;
            }
        }
        System.out.println(count);
    }
}
