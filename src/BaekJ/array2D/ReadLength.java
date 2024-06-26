package BaekJ.array2D;

import java.util.Scanner;

public class ReadLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            words[i] = sc.next();
        }

        length(words);
    }

    static void length(String[] words) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (words[j].length() > i) {
                    result.append(words[j].charAt(i));
                }
            }
        }

        System.out.println(result);
    }
}
