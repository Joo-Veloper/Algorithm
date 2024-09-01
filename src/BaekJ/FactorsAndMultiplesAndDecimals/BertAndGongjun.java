package BaekJ.FactorsAndMultiplesAndDecimals;

import java.util.Scanner;

public class BertAndGongjun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            boolean arr[] = new boolean[2 * n + 1];
            // 0과 1은 소수 아님
            arr[0] = true;
            arr[1] = true;

            // 소수 배수를 걸러내는
            for (int i = 2; i * i <= 2 * n; i++) {
                if (!arr[i]) {
                    for (int j = i * i; j <= 2 * n; j += i) {
                        arr[j] = true;
                    }
                }
            }
            //소수의 개수를 세기 위한 변수 cnt를 0으로 초기화합니다.
            int cnt = 0;
            // n + 1부터 2 * n까지 반복하며 arr[i]가 false인 경우(즉, 소수인 경우) cnt를 증가시킵니다.
            // 이 반복문은 주어진 문제의 조건에 맞는 소수의 개수를 찾는 역할을 합니다.
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!arr[i]) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}
//문제 4948
//베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
//
//이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
//
//예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또,
// 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
//
//자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
//
//입력
//입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.
//
//입력의 마지막에는 0이 주어진다.
//
//출력
//각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.