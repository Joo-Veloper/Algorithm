package Basic.Chap01;

public class Multi99 {
    public static void main(String[] args) {
        System.out.println("9 X 9");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
