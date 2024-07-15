package BaekJ.geometry;


import java.util.Arrays;
import java.util.Scanner;

public class Earth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];


        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int result = (a[n - 1] - a[0]) * (b[n - 1] - b[0]);
        /*a[n - 1]: 배열 a는 정렬되어 있습니다. a[n - 1]은 배열 a에서 가장 큰 값(최대값)을 의미
          a[0]: 배열 a는 정렬되어 있습니다. a[0]은 배열 a에서 가장 작은 값(최소값)을 의미
          a[n - 1] - a[0]: 배열 a의 최대값에서 최소값을 뺀 값입니다. 즉, 배열 a의 값들 사이의 범위(최대값과 최소값의 차이)를 의미
          b[n - 1]: 배열 b도 정렬되어 있습니다. b[n - 1]은 배열 b에서 가장 큰 값(최대값)을 의미
          b[0]: 배열 b는 정렬되어 있습니다. b[0]은 배열 b에서 가장 작은 값(최소값)을 의미
          b[n - 1] - b[0]: 배열 b의 최대값에서 최소값을 뺀 값입니다. 즉, 배열 b의 값들 사이의 범위(최대값과 최소값의 차이)를 의미
          (a[n - 1] - a[0]) * (b[n - 1] - b[0]): 배열 a와 배열 b의 값들 사이의 범위를 곱한 값. 두 배열의 최대값과 최소값 사이의 차이를 곱하여 최종 결과를 계산*/
        System.out.println(result);
    }
}
