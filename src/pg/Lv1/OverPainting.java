package pg.Lv1;

import java.util.Scanner;

public class OverPainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int k = sc.nextInt();
        int[] section = new int[k];

        System.out.println(solution(n, m, section));
    }

    private static int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0] + (m-1);
        int answer = 1;

        for(int i : section){
            if(i>=start && i<=end)
                continue;
            else{
                start = i;
                end = i + (m-1);
                answer++;
            }

        }
        return answer;
    }
}
