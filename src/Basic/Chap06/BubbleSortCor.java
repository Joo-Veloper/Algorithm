package Basic.Chap06;

import java.util.Scanner;

public class BubbleSortCor {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    static void bubbleSort(int[] a, int n) { // 정수 배열 a와 배열 n을 매개변수로 받는 함수
        for (int i = n - 1; i > 0 ; i--) {  // 배열의 마지막 인덱스부터 n-1번 반복
            for (int j = 0; j < i; j++) { // 인덱스 0부터 i-1까지 반복
                if (a[j] > a[j + 1]) // J+i 의 요소보다 큰지 확인 조건이 참이면 요서의 순서가 잘못된것이므로
                    swap(a, j, j + 1); //swap 함수 호출
                                            //swap함수는 배열 a와 인덱스 j 및 j+1을 매개변수로 받아 두 요소 위치 교환
            }
        }
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
        System.out.println("오름차순으로 정렬");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
