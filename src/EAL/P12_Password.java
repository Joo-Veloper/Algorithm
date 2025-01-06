package EAL;

import java.util.Scanner;

public class P12_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(solution(num, str));

    }

    private static StringBuilder solution(int num, String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < num; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int number = Integer.parseInt(tmp, 2);
            answer.append((char) number);
            str=str.substring(7);
        }
        return answer;
    }

}
