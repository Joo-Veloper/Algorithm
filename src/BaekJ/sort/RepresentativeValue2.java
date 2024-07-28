package BaekJ.sort;


import java.util.Arrays;
import java.util.Scanner;


public class RepresentativeValue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받을 수의 개수를 n으로 설정합니다.
        int n = sc.nextInt();
        int[] a = new int[n];

        int sum = 0;

        // 배열에 숫자를 입력받습니다.
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        int average = sum / n;
        // 배열을 정렬합니다.
        Arrays.sort(a);

        // 중앙값을 계산하고 출력합니다.
        int median = a[n / 2]; // n이 홀수일 때는 중앙값이 배열의 중앙에 위치합니다.
        System.out.println("Average: " + average);
        System.out.println("Median: " + median);

        sc.close();
    }
}
