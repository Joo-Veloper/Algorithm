package Basic.chap01;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.println("2자리의 양수를 입력하세요");
        do{
            System.out.print("no 값 : ");
            no= sc.nextInt();
        }while (no < 10 || no > 99);
        System.out.println("변수 no값은 " + no + "이 되었습니다.");
    }
}
