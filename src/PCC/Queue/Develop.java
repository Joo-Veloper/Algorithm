package PCC.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Develop {
    /* 기능 개선 작업 수행 각 기능은 진도가 100%일때 서비스에 반영
    * 또 각 기능의 개발 속도는 모두 다르므로 뒤의 기능이 파의 기능보다 먼저 개발 될 수 도 있습니다.
    * 이때 뒤의 기능은 앞의 기능이 배포될 때 함께 배포되어야 합니다. 배포 순서대로 작업 진도가 적힌 정수 배열와 각 작업의 개발 속도가
    * 적힌 정수 배열이 주어질 때 각 배포마다 몇 개의 기능이 배포되는지 반환하도록 solution 함수를 완성 */

    public static void main(String[] args) {
        Develop develop = new Develop();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] result = develop.solution(progresses, speeds);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> answer = new ArrayDeque<>();

        int n = progresses.length;
        int[] daysLeft = new int[n];
        for (int i = 0; i < n; i++) {
            daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        int count = 0;
        int maxDay = daysLeft[0];

        for (int i = 0; i < n; i++) {
            if (daysLeft[i] <= maxDay) {
                count++;
            }
            else{
                answer.add(count);
                count = 1;
                maxDay = daysLeft[i];
            }
        }
        answer.add(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
