package Basic.chap01;

import java.util.Scanner;

public class Alternative2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("+와 -를 번갈아가며 n개 출력합니다.");
        do {
            System.out.print("n 값 : ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n/2; i++) { // for 문은 +-를 2회 출력 n이 12 면 6번 15이면 7번 출력
            System.out.print("+-");
        }
        if (n%2!=0){
            System.out.print("+");
        }
    }
}
