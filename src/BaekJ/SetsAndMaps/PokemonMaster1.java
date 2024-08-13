package BaekJ.SetsAndMaps;

import java.util.HashMap;
import java.util.Scanner;

public class PokemonMaster1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        HashMap<Integer, String> hash1 = new HashMap<>();
        HashMap<String, Integer> hash2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String S = sc.nextLine();
            hash1.put(i, S);
            hash2.put(S, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String S = sc.nextLine();
            // 입력값이 숫자인지 포켓몬 이름인지 판별
            if (S.matches("\\d+")) { // 숫자인 경우
                sb.append(hash1.get(Integer.parseInt(S))).append("\n");
            } else { // 문자열인 경우
                sb.append(hash2.get(S)).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
