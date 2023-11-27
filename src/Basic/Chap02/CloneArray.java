package Basic.Chap02;

import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,0,5};

        b[3] = 0;
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("a = " + Arrays.toString(b));
    }
}
