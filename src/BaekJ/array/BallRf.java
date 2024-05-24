package BaekJ.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BallRf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] baskets = new int[N];

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            // 1-based index를 0-based index로 변환
            for (int index = i - 1; index < j; index++) {
                baskets[index] = k;
            }
        }

        for (int b = 0; b < N; b++) {
            System.out.print(baskets[b]);
            if (b < N - 1) {
                System.out.print(" ");
            }
        }
    }
}
