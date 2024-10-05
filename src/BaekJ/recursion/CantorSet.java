package BaekJ.recursion;

import java.util.Scanner;

public class CantorSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();

            int length = (int) Math.pow(3, N);
            char[] arr = new char[length];

            for (int i = 0; i < length; i++) {
                arr[i] = '-';
            }
            createCantorSet(arr, 0, length);

            System.out.println(new String(arr));
        }

    }

    private static void createCantorSet(char[] arr, int start, int length) {
        if (length == 1) {
            return;
        }
        int dividedLength = length / 3;

        for (int i = start + dividedLength; i < start + 2 * dividedLength; i++) {
            arr[i] = ' ';
        }

        createCantorSet(arr, start, dividedLength);
        createCantorSet(arr, start + 2 * dividedLength, dividedLength);
    }
}
