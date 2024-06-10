package BaekJ.deep;

import java.util.Scanner;

public class Room1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        if (room(s)) {
            System.out.println(s);
        } else {
            System.out.println("다르다");
        }
        sc.close();
    }

    private static boolean room(String s) {
        int left = 0; //왼쪽 끝을 가리키는 인덱스
        int right = s.length() - 1;// 오른쪽 끝을 가리키는 인덱스    s.length() - 1 = 문자열 길이 -1

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
