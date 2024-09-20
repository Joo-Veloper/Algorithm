package BaekJ.stack;

import java.io.*;
import java.util.*;

public class QueueStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        int A[] = new int[n];
        int B[] = new int[n];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st2.nextToken());
        }

        int m = Integer.parseInt(br.readLine());

        int C[] = new int[m]; //2 4 7
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++)
        {
            C[i] = Integer.parseInt(st3.nextToken());
        }

        for(int i=0; i<n; i++)
        {
            if(A[i]==0)
            {
                deque.addFirst(B[i]);
            }
        }

        for(int i=0; i<m; i++)
        {
            deque.add(C[i]);
            bw.write(deque.pollFirst()+" ");
        }
        bw.flush();
        bw.close();
    }
}
