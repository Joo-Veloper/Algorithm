package BaekJ.multiples;

import java.util.Scanner;

public class MultiplesAndDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first;
        int second;


        while (true) {

            first = sc.nextInt();
            second = sc.nextInt();

            if(first == 0 && second == 0){
                break;
            }

            if(second % first == 0) {
                System.out.println("factor");
            }
            else if(first % second == 0) {
                System.out.println("multiple");
            }
            else {
                System.out.println("neither");
            }
        }
    }
}
