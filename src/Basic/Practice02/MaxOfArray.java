package Basic.Practice02;
import java.util.*;

// 의사 난수
// 컴퓨터 환경에서 무작위로 선택한 것처럼 보이는 난수를 생성하는데 그 입력값이나 컴퓨터 환경이 같다면 그 결괏값은 항상 같습니다. 결국 컴퓨터에서
// 생성된 모든 난수는 미리 컴퓨터가 계산해 둔 의사 난수입니다.
// 선형 합동법
// 봎편적으로 사용하는 의사 난수 생성기 현재 의사 난수값을 A배하고, C를 더한 다음 , M으로 나눈 나머지를 의사 난수로 선택하는 방법
public class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("키의 최대값을 구합니다.");
        int num = 1 + rand.nextInt(20);
        int[] height = new int[num];

        System.out.println("사람 수 :" + num); //배열의 요솟수 입력받음
        System.out.println("키는 다음과 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
