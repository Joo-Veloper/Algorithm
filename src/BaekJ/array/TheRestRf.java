package BaekJ.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TheRestRf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];
        int num = 0;
        int count = 0;
        int[] compare = new int[42];

        for (int i = 0; i < array.length; i++) {

            array[i] = Integer.parseInt(br.readLine());
            num = array[i] % 42;

            compare[num] = num + i;
        }
        for (int i = 0; i < compare.length; i++) {
            if (compare[i] != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}