package BaekJ.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BallChangeRf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] baskets = new int[N];

        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()) - 1;
            int b= Integer.parseInt(st.nextToken()) - 1;
            int temp = baskets[a];
            baskets[a] = baskets[b];
            baskets[b] = temp;
        }

        for (int b = 0; b < N; b++) {
            System.out.print(baskets[b]);
            if (b < N - 1) {
                System.out.print(" ");
            }
        }
    }
}
