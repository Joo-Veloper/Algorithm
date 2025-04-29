package EAL._04_Hash;

import java.util.*;

public class P03_TypesOfSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N일, K일 입력
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 결과 출력
        for (int x : solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }

    private static List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        // 초기 윈도우 설정 (K-1개까지)
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            // 오른쪽 끝 요소 추가
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);

            // 현재 구간의 매출액 종류 수 추가
            result.add(map.size());

            // 왼쪽 요소 제거
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++; // 윈도우 왼쪽 포인터 이동
        }

        return result;
    }
}