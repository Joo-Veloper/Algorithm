package CodingTest;

//import java.util.*;
//
//public class TwoPointer {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int count = 1;
//        int start_index = 1;
//        int end_index = 1;
//        int sum = 1;
//
//        while (end_index != N) {
//            if(sum == N){
//                count ++;
//                end_index++;
//                sum = sum + end_index;
//            } else if (sum > N) {
//                sum = sum - start_index;
//            }else{
//                sum = sum + end_index;
//            }
//        }
//        System.out.println(count);
//    }
//}
import java.util.*;

public class TwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int start_index = 1;
        int end_index = 1;
        int sum = 0;

        while (start_index <= N / 2) {

            if (sum < N) {
                sum += end_index;
                end_index++;
            } else if (sum > N) {
                sum -= start_index;
                start_index++;
            } else {
                count++;
                sum -= start_index;
                start_index++;
            }
        }

        System.out.println(count + 1);
    }
}