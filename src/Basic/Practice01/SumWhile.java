package Basic.Practice01;

import java.util.Scanner;

/* while 문이 종료될 때 변수 i값이 n + 1이 되는지 확인*/
public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1에서 n까지의 충첩을 구합니다.");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("1에서 " + n +  "까지 합은 " + sum + "입니다.");
        System.out.println("1에서 " + i +  "로 됩니다.");
    }
}
