package BaekJ.loop;

import java.io.*;

public class A_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            String[] parts = s.split(" ");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            int SUM = A + B;
            bw.write("Case #" + (i + 1) + ": " + SUM + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
