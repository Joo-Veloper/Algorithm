package pg.Lv1;
import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};

        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};

        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(solution(lottos1, win_nums1))); // [3, 5]
        System.out.println(Arrays.toString(solution(lottos2, win_nums2))); // [1, 6]
        System.out.println(Arrays.toString(solution(lottos3, win_nums3))); // [1, 1]
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;

        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winSet.contains(num)) {
                matchCount++;
            }
        }

        int maxMatch = matchCount + zeroCount;
        int minMatch = matchCount;

        return new int[]{getRank(maxMatch), getRank(minMatch)};
    }

    public static int getRank(int matchCount) {
        if (matchCount >= 2) {
            return 7 - matchCount;
        }
        return 6;
    }
}
