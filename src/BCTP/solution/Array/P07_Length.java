package BCTP.solution.Array;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class P07_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dirs = sc.nextLine();
        System.out.println(solution(dirs));
    }

    private static int solution(String dirs) {
        HashSet<String> visited = new HashSet<>();
        int x = 0, y = 0;

        Map<Character, int[]> moves = Map.of(
                'U', new int[]{0, 1},
                'D', new int[]{0, -1},
                'R', new int[]{1, 0},
                'L', new int[]{-1, 0}
        );

        for (char dir : dirs.toCharArray()) {
            int nx = x + moves.get(dir)[0];
            int ny = y + moves.get(dir)[1];

            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue;
            }

            String path1 = x + "," + y + "->" + nx + "," + ny;
            String path2 = nx + "," + ny + "->" + x + "," + y;

            visited.add(path1);
            visited.add(path2);

            x = nx;
            y = ny;
        }

        return visited.size() / 2;

    }
}
