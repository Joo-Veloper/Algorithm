package BaekJ.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Press {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] arrSort = new int[n];
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = arrSort[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arrSort);

        int rank = 0;
        for (int value : arrSort) {
            if (!rankMap.containsKey(value)) {
                rankMap.put(value, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int value : arr) {
            sb.append(rankMap.get(value)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
