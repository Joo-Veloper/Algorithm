package EAL._01_string;

import java.util.ArrayList;
import java.util.Scanner;

public class P06_RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static StringBuilder solution(String str) {
        StringBuilder sb = new StringBuilder();
        char[] array = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb;
    }
}
