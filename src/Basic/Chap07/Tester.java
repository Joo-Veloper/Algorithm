package Basic.Chap07;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("텍스트 : ");
        String s1 = sc.next();

        System.out.print("패 턴 : " );
        String s2 = sc.next();

        int idx1 = s1.indexOf(s2);
        int idx2 = s1.lastIndexOf(s2);

        if(idx1 == -1)
            System.out.println("텍스트 안에 패턴이 있습니다.");
        else{
            int len1 = 0;
            for (int i = 0; i < idx1; i++)
                len1 += s1.substring(i,i + 1).getBytes().length;
            len1 += s2.length();

            int len2 = 0;
            for (int i = 0; i < idx2; i++) {
                len2 += s1.substring(i, i + 1).getBytes().length;
            }
            len2 += s2.length();

            System.out.println("텍스트 : " + s1);
            System.out.printf(String.format("패턴 : %%%ds\n", len1), s2);
            System.out.println("텍스트 : " + s1);
            System.out.printf(String.format("패턴 : %%%ds\n", len2), s2);
        }
    }
}
