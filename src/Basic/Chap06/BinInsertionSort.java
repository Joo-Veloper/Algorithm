package Basic.Chap06;

import java.util.Scanner;

public class BinInsertionSort {
    static void insertionSort(int[] a, int n) {
        for (int i = 2; i < n; i++) {
            int tmp = a[0] = a[i];
            int j = i;
            for (   ; a[j - 1] > tmp ; j--) {
                a[j] = a[j - 1];
            }if(j>0)a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단순삽입정렬");
        System.out.print("요솟수");
        int nx = sc.nextInt();
        int[] x = new int[nx + 1];

        for (int i = 1; i <= nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }
        insertionSort(x, nx+1);
        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 1; i <= nx ; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
