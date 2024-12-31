package EAL;

import java.util.Scanner;

public class P05_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(soultion(sentence));
    }

    private static String soultion(String sentence) {
        char[] chars = sentence.toCharArray();
        int left = 0;
        int right = sentence.length() - 1;

        while (left < right) {
            if (!Character.isAlphabetic(chars[left])) {
                left++;
            } else if (!Character.isAlphabetic(chars[right])) {
                right++;
            }  else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
