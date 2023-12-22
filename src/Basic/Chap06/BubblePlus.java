package Basic.Chap06;

import java.util.Scanner;

public class BubblePlus {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    static void bubbleSort(int[] a, int n) {
       int ccnt = 0; // 비교 횟수를 세는 변수
       int scnt = 0; // 교환 횟수를 세는 변수
        for (int i = 0; i < n - 1; i++) { // 배열의 마지막 요소를 제외한 각 요소 반복
            System.out.printf("패스%d : \n",i + 1);
            for (int j = n - 1; j > i ; j--) {// 중첩된 방복문이 요소를 비교 및 교환
                for (int m = 0; m < n - 1; m++) { // 배열의 요소를 출력하고 비교를 나타내는 마커 +, - 표시
                    System.out.printf("%3d %c", a[m], (m != j-1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
                }
                System.out.printf("%3d\n", a[n - 1]);

                ccnt++;
                if (a[j - 1] > a[j]) { // 인접한 요소를 비교
                    scnt++;
                    swap(a, j - 1, j);
                }
            }
            for (int m = 0; m < n; m++) {
                System.out.printf("%3d ", a[m]);
            }
            System.out.println();
        }
        System.out.println("비교률 " + ccnt + "회 했습니다.");
        System.out.println("교환율 " + scnt + "회 했습니다.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("버블정렬");
        System.out.println("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] :");
            x[i] = sc.nextInt();
        }
        bubbleSort(x, nx);
        System.out.println("오름차순 정렬");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
