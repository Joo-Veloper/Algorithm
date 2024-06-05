package BaekJ.string;

import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                count++;
            }
        }
        if (word.charAt(0) != ' ' && word.charAt(word.length() - 1) != ' ') {
            count = count + 1;
        }
        if (word.charAt(0) != ' ' && word.charAt(word.length() - 1) == ' ') {
            count = count - 1;
        }
        System.out.println(count);
    }
}
