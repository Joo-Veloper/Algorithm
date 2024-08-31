package BaekJ.FactorsAndMultiplesAndDecimals;

import java.util.Scanner;

public class Minority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long[] arr = new long[t];

        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextLong();
        }

        for (int i = 0; i < t; i++) {
            long n = arr[i];
            while (!isPrime(n)) {
                n++;
            }
            System.out.println(n);
        }
        sc.close();
    }

    public static boolean isPrime(long num) {

        if(num < 2){
            return false;
        } else if (num == 2) {
            return true;
        } else if (num%2==0) {
            return false;
        }

        for (long i = 3; i*i <= num ; i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
