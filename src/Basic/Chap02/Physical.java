package Basic.Chap02;

import java.util.Scanner;

public class Physical {
    static final int VWAX = 21;

    static class PhyscData{
        String name;
        int height;
        double vision;

        //생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키 평균값을 구함
    static double aveHeight(PhyscData[] dat) {
        double sum = 0;
        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }
        return sum/dat.length;
    }
    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for (i=0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VWAX / 10.0)
                dist[(int)(dat[i].vision * 10)]++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("Joo", 176,0.3),
                new PhyscData("B", 185,0.7),
                new PhyscData("S", 165,1.5),
                new PhyscData("e", 153,0.4),
                new PhyscData("k", 188,1.2),
                new PhyscData("J", 177,0.8),
        };
        int[] vdist = new int[VWAX];

        System.out.println("신체 검사 리스트");
        System.out.println("이름      키       시력");
        System.out.println("---------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

            System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

            distVision(x, vdist);

        }
        System.out.println("\n 시력분포");
        for (int i = 0; i < VWAX; i++) {
            System.out.printf("%3.1f~: %2d명\n", i/10.0, vdist[i]);
        }
    }
}
