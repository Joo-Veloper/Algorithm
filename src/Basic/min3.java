package Basic;

public class min3 {
    static int min3(int a, int b, int c) {
        int min = a;
        if (c < min)
            min = c;
        if (b < min)
            min = b;
        return min;
    }

    public static void main(String[] args) {
        System.out.println("min3(1,2,3) = " + min3(1,2,3));
        System.out.println("min3(2,10,5) = " + min3(2,10,5));
    }
}
