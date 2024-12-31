package EAL;

import java.util.Scanner;

/*
특정 문자 뒤집기
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기
자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

▣ 입력설명
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

▣ 출력설명
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

▣ 입력예제 1
a#b!GE*T@S

▣ 출력예제 1
S#T!EG*b@a*/
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
