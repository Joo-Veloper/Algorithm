package BaekJ.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Year2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int year = Integer.parseInt(s);

        System.out.println(year - 543);
    }
}
