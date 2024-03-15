package Basic.Practice01;

public class Med3 {
    static int med3(int a, int b, int c) {
        if ((b >= a && a >= c) || (c >= a && a >= b)) {
            return a;
        } else if ((a >= b && b >= c) || (c >= b && b >= a)) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println("Med3(3,2,1) = " + med3(3,2,1));
        System.out.println("Med3(3,2,2) = " + med3(3,2,2));
        System.out.println("Med3(3,1,2) = " + med3(3,1,2));
        System.out.println("Med3(3,2,3) = " + med3(3,2,3));
        System.out.println("Med3(2,1,3) = " + med3(2,1,3));
        System.out.println("Med3(3,3,2) = " + med3(3,3,2));
        System.out.println("Med3(3,3,3) = " + med3(3,3,3));
        System.out.println("Med3(2,2,3) = " + med3(2,2,3));
        System.out.println("Med3(2,3,1) = " + med3(2,3,1));
        System.out.println("Med3(2,3,2) = " + med3(2,3,2));
        System.out.println("Med3(1,3,2) = " + med3(1,3,2));
        System.out.println("Med3(2,3,3) = " + med3(2,3,3));
        System.out.println("Med3(1,2,3) = " + med3(1,2,3));
    }
}