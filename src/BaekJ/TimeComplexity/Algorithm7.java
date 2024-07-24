package BaekJ.TimeComplexity;

import java.util.Scanner;

public class Algorithm7 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int x1 = sc.nextInt();
                int x2 = sc.nextInt();
                int c = sc.nextInt();
                int n = sc.nextInt();

                int a = x1 * n + x2;
                int b = c*n;

                if (a <= b && x1 <= c){
                        System.out.println(1);
                }else
                {
                        System.out.println(0);
                }
        }

}
