package Basic.Chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysSearch {
    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision){
            this.name = name; this.height = height; this.vision = vision;
        }
        public String toString() {
            return name + " " + height + " " + vision;
        }
        public static final Comparator<PhyscData> HEIGHT_ORDER =
                new HeightOrderComparator();
        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("java", 162,0.3),
                new PhyscData("python", 176, 1.8),
                new PhyscData("C", 190, 2.0)
        };
        System.out.print("키가 몇 cm인 사람을 찾고 있나요");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(
                x,
                new PhyscData("", height, 0.0),
                PhyscData.HEIGHT_ORDER
        );
        if(idx<0)
            System.out.println("그 요소가 없습니다.");
        else {
            System.out.println("그 값은 x["+idx+"]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        };
    }
}
