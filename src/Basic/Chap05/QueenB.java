package Basic.Chap05;

public class QueenB {
    static boolean[] flag = new boolean[5];
    static int[] pos = new int[5];

    static void print() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }
    static void set(int i) {
        for (int j = 0; j < 5; j++) {
            if(flag[i] == false) {
                pos[i] = j;
                if(i == 4) {
                    print();
                }
                else{
                    flag[j] = true;
                    set(i + 1);
                    flag[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
