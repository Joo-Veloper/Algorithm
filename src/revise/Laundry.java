package revise;

import java.util.Scanner;

public class Laundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;

        for (int i = 0; i < d; i++) {
            int c = sc.nextInt();
            System.out.print(c / Quarter + " ");
            c = c % Quarter;
            System.out.print(c / Dime + " ");
            c = c % Dime;
            System.out.print(c / Nickel + " ");
            c = c % Nickel;
            System.out.println(c / Penny);
        }
        sc.close();
    }
}
