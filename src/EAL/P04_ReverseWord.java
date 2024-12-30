package EAL;

import java.util.Scanner;

public class P04_ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단어의 개수 입력
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine(); // 각 단어 입력
            System.out.println(solution(word)); // 뒤집은 단어 출력
        }
    }

    private static StringBuilder solution(String word) {
        StringBuilder answer = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) { // 단어를 뒤에서부터 읽음
            answer.append(word.charAt(i));
        }
        return answer;
    }
}
