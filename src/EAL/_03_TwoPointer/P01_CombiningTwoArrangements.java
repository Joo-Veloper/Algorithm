package EAL._03_TwoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P01_CombiningTwoArrangements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        for (int x : solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
       /* ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);
        return answer;*/
        ArrayList<Integer> answer = new ArrayList<>();

        for (int num : a) {
            answer.add(num);
        }

        for (int num : b) {
            answer.add(num);
        }

        Collections.sort(answer);


        return answer;
    }

}
