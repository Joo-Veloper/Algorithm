package PCC.RequiredGrammar;

import java.util.Arrays;

public class ArrayON {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        long start = System.currentTimeMillis();
        int[] bubble = bubbleSort(arr);
        long end = System.currentTimeMillis();
        // Bubble 정렬 코드 시간 측정
        // 1.8

        System.out.println((end - start) / 1000.0 + "초");
        start = System.currentTimeMillis();
        int[] sort = doSort(arr);
        end = System.currentTimeMillis();
        // API 코드 시간 측정
        // 0.001
        System.out.println((end - start) / 1000.0 + "초");
        // 두개 같은 지 확인
        System.out.println(Arrays.equals(bubble, sort));
    }

    private static int[] bubbleSort(int[] org) {
        int[] arr = org.clone();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[i + j] = tmp;
                }
            }
        }
        return arr;
    }
    private static int[] doSort(int[] org){
        int[] arr = org.clone();
        Arrays.sort(arr);
        return arr;
    }
}
