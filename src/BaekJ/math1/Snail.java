package BaekJ.math1;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A; //올라간 미터
        int B; //잠잘때 미끄러진 미터
        int V; //정상에 올라간 후에는 미끄러 지지 않음


        A = sc.nextInt();
        B = sc.nextInt();
        V = sc.nextInt();

        int day = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);

    }
}
