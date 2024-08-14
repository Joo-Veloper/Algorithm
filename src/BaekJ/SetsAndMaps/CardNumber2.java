package BaekJ.SetsAndMaps;

import java.util.Arrays;
import java.util.Scanner;

public class CardNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt(); // 상근이가 가지고 있는 숫자 카드 n개
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt(); // 정수 m
        Arrays.sort(arr);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            sb.append(uppend(arr, a) - lower(arr, a)).append(" ");
        }
        System.out.println(sb);
    }

    private static int uppend(int[] arr, int a) {
        int left = 0;
        int right = arr.length;
        while(left<right){
            int mid = (left+right)/2;
            if(a < arr[mid]){
                right = mid;
            }else left=mid + 1;
        }
        return left;
    }

    public static int lower(int[] arr, int a){
        int left = 0;
        int right = arr.length;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid]>=a){
                right = mid;
            }else left = mid + 1;
        }
        return left;
    }

}
