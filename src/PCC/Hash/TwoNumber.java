package PCC.Hash;

import java.util.HashSet;
import java.util.Scanner;

public class TwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("배열의 요소들을 입력하세요:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("목표 합계를 입력하세요: ");
        int target = sc.nextInt();

        Solution sol = new Solution();
        boolean result = sol.solution(arr, target);

        if (result) {
            System.out.println("배열에서 합이 목표값이 되는 두 숫자가 존재합니다.");
        } else {
            System.out.println("배열에서 합이 목표값이 되는 두 숫자가 존재하지 않습니다.");
        }
    }

    static class Solution {
        public boolean solution(int[] arr, int target) {
            HashSet<Integer> hashSet = new HashSet<>();

            for (int i : arr) {
                if (hashSet.contains(target - i)) {
                    return true;
                }
                hashSet.add(i);
            }
            return false;
        }
    }
}
