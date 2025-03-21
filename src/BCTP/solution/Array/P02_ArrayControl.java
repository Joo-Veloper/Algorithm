package BCTP.solution.Array;

import java.util.*;

public class P02_ArrayControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> arr = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(solution(arr));
    }

    private static List<Integer> solution(Set<Integer> arr) {
        List<Integer> answer = new ArrayList<>(arr);
        answer.sort(Collections.reverseOrder());
        return answer;
    }
}
