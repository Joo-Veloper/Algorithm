package Basic.Practice02;

import java.util.Scanner;

public class Physical {
    static final int VMAX = 21;

    static class PhyscData{
        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }
    static double aveHeight(PhyscData[] dat){
        double sum = 0;
        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }
        return sum / dat.length;
    }
    static void distVision(PhyscData[] dat, int[] dist){
        int i = 0;
        dist[i] = 0;
        for (i = 0; i<dat.length; i++) {
            if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0){
                dist[(int)(dat[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("A", 162,0.3),
                new PhyscData("B", 161,0.7),
                new PhyscData("C", 153,0.9),
                new PhyscData("D", 176,0.1),
                new PhyscData("E", 182,0.2),
                new PhyscData("F", 171,0.3),
                new PhyscData("G", 175,0.8),
                new PhyscData("H", 174,0.6),
                new PhyscData("I", 169,1.0),

        };
        int[] vdist = new int[VMAX];

        System.out.println("신체 검사");
        System.out.println("이름      키       시력");
        System.out.println("----------------------");

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name,x[i].height,x[i].vision);
        }
        System.out.printf("\n평균키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);
        System.out.println("\n시력분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~ : ", i / 10.0);
            for (int j = 0; j < vdist[i]; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
