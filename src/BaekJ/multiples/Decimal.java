package BaekJ.multiples;

import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int minPrime = Integer.MAX_VALUE;
        boolean foundPrime = false;

        // M부터 N까지 소수를 찾고 합과 최솟값 구하기
        for (int num = M; num <= N; num++) {
            if (isPrime(num)) {
                foundPrime = true;
                sum += num;
                if (minPrime > num) {
                    minPrime = num;
                }
            }
        }

        // 소수가 하나도 없는 경우 -1 출력
        if (!foundPrime) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

