package BCTP.solution.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Logger;

public class Problem3_O_N2logN2 {
    private final static Logger log = Logger.getGlobal();
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2,1,3,4,1})));
        System.out.println(Arrays.toString(solution(new int[]{5,0,2,7})));
    }
    public static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length -1; i++){
            log.info("현재 i 값: " + i);
            for(int j = i + 1; j<numbers.length; j++){
                log.info("현재 j 값: " + j);
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
