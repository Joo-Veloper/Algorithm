package Basic.Practice01;
// 네 값의 최댓값을 구하는 max4 메서드를 작성, 작성한 메서드를 테스트 하기 위해 메인 메서드를 포함한 프로그램 작성

import java.util.*;

public class Max4 {
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        if(d>max){
            max = d;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("네 정수의 최댓값 입력 .");
        System.out.print("a 값 :");
        a = sc.nextInt();
        System.out.print("b 값 :");
        b = sc.nextInt();
        System.out.print("c 값 :");
        c = sc.nextInt();
        System.out.print("d 값 :");
        d = sc.nextInt();

        int max = max4(a, b, c, d);
        System.out.println("최대값 : " + max);

    }
}
