package pg.Lv1;

import java.util.Arrays;
import java.util.Scanner;

public class SecretMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(solution(n, arr1, arr2)));

    }

    /*private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            int com = arr1[i] | arr2[i];
            System.out.println("arr1[" + i + "] = " + arr1[i] + ", arr2[" + i + "] = " + arr2[i] + ", OR = " + com);

            String binary = String.format("%" + n + "s", Integer.toBinaryString(com)).replace(' ', '0');
            System.out.println("  -> binary: " + binary);

            binary = binary.replace('1', '#').replace('0', ' ');
            System.out.println("  -> map row: " + binary);

            result[i] = binary;
        }

        return result;
    }*/

    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            int com = arr1[i] | arr2[i];
            String binary = String.format("%" + n + "s", Integer.toBinaryString(com)).replace(' ', '0');

            binary = binary.replace('1', '#').replace('0', ' ');

            result[i] = binary;
        }

        return result;
    }
}
