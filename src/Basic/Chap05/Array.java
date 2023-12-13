package Basic.Chap05;

import java.util.Scanner;

public class Array {
    static int gcd(int x, int y) {
        while(y!=0) { // y가 0이 될때까지 계속되는 while 루프 사용
            int temp = y; // temp변수y에 저장
            y = x % y;  // y =  x를 y로 나눈 나머지로 업데이트
            x = temp; /// x는 이전 y의 값을 가지게 된다.
        }
        return (x);
    }
    static int gcdArray(int a[], int start, int no) {
        if (no == 1) // no가 1일 경우 배열에 하난의 요소만 있는경우에 해당 요소 자체가 최대 공약수이므로 해당 값 반환
            return a[start]; //no가 2일 경우 배열에 두갱의 요소가 있는 경우, 두 요소의 최대공약수를 구하기 위해 gcd함수를 호출하여 값 반환
        else if (no == 2)
            return gcd(a[start], a[start + 1]);
        else
            return gcd(a[start], gcdArray(a, start + 1, no - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇개의 정수로 최대공약수를 구할까요?");
        int num ;
        do{
            num = sc.nextInt();
        }while(num <= 1);
        int[] x= new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }
        System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
    }
}
