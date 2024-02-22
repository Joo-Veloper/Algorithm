package CodingTest.Time_complexity;

public class NumberSorting {
    // n
//    public static void main(String[] args) {
//        int n = 1000000;
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            System.out.println("연산 횟수:" + cnt++);
//        }
//    }
    // 3n
//    public static void main(String[] args) {
//        int n = 1000000;
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            System.out.println("연산 횟수:" + cnt++);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println("연산 횟수:" + cnt++);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println("연산 횟수:" + cnt++);
//        }
//    }
    // n * n
    public static void main(String[] args) {
        int n = 1000000;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("연산 횟수:"+ cnt++);
            }
        }
    }
}
