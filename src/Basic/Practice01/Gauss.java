package Basic.Practice01;
/** 가우스
 * S = 2/n(n+1)*/
import java.util.Scanner;
public class Gauss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~10의 합은? ");
        System.out.print("n값은?");
        int n = sc.nextInt();

        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
        // (n + 1) * (n / 2) -> 2/n(n+1)
        /* 홀짝 모두 같은 값 도출
        * int sum = (n+1)* n/2;
        * 홀수일 경우 오답을 도출
        * sum = (n+1)*(n/2)
        */

        System.out.println("1부터 " + n + " 까지의 "+ sum + " 합입니다.");
    }
}
