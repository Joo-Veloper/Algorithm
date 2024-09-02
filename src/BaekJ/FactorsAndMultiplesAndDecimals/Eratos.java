package BaekJ.FactorsAndMultiplesAndDecimals;

import java.util.ArrayList;
import java.util.Scanner;

public class Eratos {
    public static void main(String[] args) {
        // ArrayList로 구현
        ArrayList<Boolean> primeList;

        // 사용자로부터의 콘솔 입력
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        // n <= 1 일 때 종료
        if(n <= 1) {
            System.out.println("{}");
            return;
        }

        // n+1만큼 할당
        primeList = new ArrayList<Boolean>(n + 1);
        // 초기화: 0부터 n까지 false로 초기화
        for (int i = 0; i <= n; i++) {
            primeList.add(false);
        }

        // 2번째부터 소수로 설정
        primeList.set(2, true);
        for (int i = 3; i <= n; i++) {
            primeList.set(i, true);
        }

        // 2부터  ~ i*i <= n
        // 각각의 배수들을 지워간다.
        for (int i = 2; (i * i) <= n; i++) {
            if (primeList.get(i)) {
                for (int j = i * i; j <= n; j += i) {
                    primeList.set(j, false);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean first = true;
        for (int i = 2; i <= n; i++) {
            if (primeList.get(i)) {
                if (!first) {
                    sb.append(", ");
                }
                sb.append(i);
                first = false;
            }
        }
        sb.append("}");

        System.out.println(sb.toString());
    }
}
