package BaekJ.FactorsAndMultiplesAndDecimals;

import java.util.Scanner;

public class Goldbach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // 테스트 케이스의 수
        int max = 1000000;  // N의 최대값

        // 에라토스테네스의 체를 사용하여 소수를 구합니다.
        boolean[] isPrime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 각 테스트 케이스에 대해 결과를 계산합니다.
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int count = 0;

            // N을 두 소수의 합으로 표현할 수 있는 경우의 수를 계산
            for (int i = 2; i <= N / 2; i++) {
                if (isPrime[i] && isPrime[N - i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
 }
