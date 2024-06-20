package PCC.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MockTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] num = solution(arr);
        System.out.println(Arrays.toString(num));
    }

    private static int[] solution(int[] arr) {
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2},
                {3, 3, 1, 1, 2}
        };

        int[] scores = new int[3];
        for (int i = 0; i < arr.length; i++) {
            // 각 학생 패턴
            for (int j = 0; j < pattern.length; j++) {
                //pattern[j][i % pattern[j].length]은 i를 pattern[j]의 길이로 나눈 나머지를 인덱스로 사용하여 패턴이 반복되도록 합니다.
                if (arr[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }
            }
        }
        int maxScore = Arrays.stream(scores).max().getAsInt();

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }


}
