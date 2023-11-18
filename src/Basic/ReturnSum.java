package Basic;
import java.util.Scanner;

public class ReturnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int b = sc.nextInt();

        int result = sumof(a, b);
        System.out.println(a + "와 " + b + " 사이의 합: " + result);

        sc.close();
    }

    static int sumof(int a, int b) {
        int sum = 0;

        // a부터 b까지의 모든 정수를 더합니다
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            sum += i;
        }

        return sum;
    }
}

