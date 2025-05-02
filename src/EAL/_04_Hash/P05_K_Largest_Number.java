package EAL._04_Hash;


import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class P05_K_Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        int answer = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        for (int i : set) {
            count++;
            if (count == k) {
                return i;
            }
        }
        return answer;
    }
}
