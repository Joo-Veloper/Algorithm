package BCTP.solution.Array;

import java.util.HashMap;
import java.util.HashSet;

public class problem7_ON {
    public static void main(String[] args) {
        String dirs1 = "ULURRDLLU";
        int result1 = solution(dirs1);
        System.out.println("테스트 케이스 1: " + result1 + " (기대값: 7)");

        String dirs2 = "LULLLLLLU";
        int result2 = solution(dirs2);
        System.out.println("테스트 케이스 2: " + result2 + " (기대값: 7)");

        String dirs3 = "UUUUUUUUUU";
        int result3 = solution(dirs3);
        System.out.println("추가 테스트 케이스: " + result3 + " (기대값: ?)");

        String dirs4 = "RRRRRRRRRR";
        int result4 = solution(dirs4);
        System.out.println("추가 테스트 케이스 2: " + result4 + " (기대값: ?)");
    }

    private static boolean isValidMove(int nx, int ny) {
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }

    private static final HashMap<Character, int[]> location = new HashMap<>();
    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }

    private static int solution(String dirs) {
        initLocation();
        int x = 5, y = 5;
        HashSet<String> answer = new HashSet<>();
        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            if (!isValidMove(nx, ny)) {
                continue;
            }
            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);

            x = nx;
            y = ny;
        }
        return answer.size() / 2;
    }
}
