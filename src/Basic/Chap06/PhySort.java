package Basic.Chap06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhySort {
    static class PhyData{
        String name;//이름
        int height;// 키
        double vision;// 시력
        PhyData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
        public String toString() {
            return name + " " + height + " " + vision;
        }
        //Comparator = 오름차순
        static final Comparator<PhyData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyData>{
            public int compare(PhyData d1, PhyData d2){
                return (d1.height > d2.height) ? 1:
                        (d1.height < d2.height) ? -1 : 0;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PhyData[] x = {
                    new PhyData("java", 162, 1.3),
                    new PhyData("spring", 172, 1.5),
                    new PhyData("python", 182, 1.0),
                    new PhyData("go", 192, 0.6),
                    new PhyData("js", 152, 0.7),
                    new PhyData("C", 142, 1.3),
            };
            Arrays.sort(
                    x,
                    PhyData.HEIGHT_ORDER
            );
            System.out.println("신체검사 리스트");
            System.out.println("이름      키       시력");
            System.out.println("---------------------");
            for (int i = 0; i < x.length; i++) {
                System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
            }
        }
    }
}
