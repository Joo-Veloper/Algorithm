package BaekJ.stack;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PoppingBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] balloons = new int[n];
        List<Integer> list = new LinkedList<>();

        // 풍선의 번호와 값을 리스트에 넣습니다.
        for (int i = 0; i < n; i++) {
            balloons[i] = sc.nextInt();
            list.add(i + 1); // 풍선 번호 (1부터 시작)
        }

        StringBuilder result = new StringBuilder();
        int currentIndex = 0; // 시작 풍선의 인덱스

        while (!list.isEmpty()) {
            // 현재 풍선의 번호를 가져와 결과에 추가합니다.
            int currentBalloon = list.remove(currentIndex);
            result.append(currentBalloon).append(" ");

            // 현재 풍선 번호에 적힌 값을 가져옵니다.
            int currentNumber = balloons[currentBalloon - 1];

            // 리스트가 비어있으면 종료
            if (list.isEmpty()) {
                break;
            }

            // 이동할 거리를 계산합니다.
            if (currentNumber > 0) {
                currentIndex = (currentIndex + currentNumber - 1) % list.size();
            } else {
                currentIndex = (currentIndex + currentNumber) % list.size();
                if (currentIndex < 0) {
                    currentIndex += list.size();
                }
            }
        }

        System.out.println(result.toString().trim());
    }
}
