package revise;

import java.util.Scanner;

public class Remind3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소수");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0]: ");
        x[0] = sc.nextInt();


        for (int i = 0; i < num; i++) {
            do {
                System.out.print("x[" + i + "]:");
                x[i] = sc.nextInt();
            }
            while (x[i] > x[i - 1]);
        }
        System.out.println("검색할 값:");
        int ky = sc.nextInt();

        int idx = binSearch(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }

    private static int binSearch(int[] x, int num, int ky) {
        int pl = 0;
        int pr = num - 1;
        do {
            int pc = (pl + pr) / 2;
            if (x[pc] == ky) {
                return pc;
            } else if (x[pc] < ky) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);
        return -1;
    }
}
