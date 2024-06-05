package BaekJ.string;

import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        number1 = Integer.parseInt(new StringBuilder().append(number1).reverse().toString());
        number2 = Integer.parseInt(new StringBuilder().append(number2).reverse().toString());

        System.out.println(number1 > number2 ? number1 : number2);
    }
}
