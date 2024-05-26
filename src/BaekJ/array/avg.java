package BaekJ.array;


import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] M = new double[N];

        for (int i = 0; i < M.length; i++) {
            M[i] = sc.nextInt();
        }
        double sum = 0;
        double max = 0;
        for (int i = 0; i < N; i++) {
            if(max<M[i]) {
                max = M[i];
            }
            sum += M[i];
        }
        System.out.println(sum * 100 /max/N);
    }
}
