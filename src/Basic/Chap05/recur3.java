package Basic.Chap05;

import java.util.Scanner;

public class recur3 {
    static void recur3(int n) {
        int[] ns = new int[100];
        int[] st = new int[100];
        int ptr = -1;
        int sw = 0;

        while (true) {
            if (n > 0) {
                ptr++;
                ns[ptr] = n;
                st[ptr] = sw;
                if(sw == 0)
                    n = n-1;
                else if (sw == 1) {
                    n = n - 2;
                    sw = 0;
                }
                continue;

            }
            do{
                n = ns[ptr];
                sw = st[ptr--] + 1;
                if(sw == 2) {
                    System.out.println(n);
                    if(ptr<0){
                        return;
                    }
                }
            }
            while (sw == 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int x = sc.nextInt();
        recur3(x);
    }
}
