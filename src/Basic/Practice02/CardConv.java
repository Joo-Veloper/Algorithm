package Basic.Practice02;

import java.util.Scanner;

public class CardConv {

    static int cardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x/=r;
        }while(x != 0);

        for (int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;										// 변환하는 정수
        int cd;										// 기수
        int dno;										// 변환 후의 자릿수
        int retry;									// 한 번 더?
        char[] cno = new char[32];	// 변환 후의 각자리를 저장할 문자 배열

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = stdIn.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2-36) : ");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);		// no를 cd진수로 변환

            System.out.print(cd + "진수로는 ");
            for (int i = 0; i < dno; i++)			// 순서로 출력
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1 ... 예 / 0 ... 아니오) : ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
