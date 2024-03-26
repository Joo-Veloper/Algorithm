package CodingTest.DataStructure.Pointer;

import java.util.*;

public class TwoPointer {
    /**
     * sudo-Code
     * Scanner 입력
     * N 변수 저장
     * ( count, start_index, end_indx, sum) 초기화
     * while(end_ind != N) {
     *     if(sum == N){}
     *     else if(sum < N)
     *     else
     * }
     * count
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > N) {
                sum = sum - start_index;
                start_index++;
            } else {
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
