package pg;

import java.util.HashSet;

public class Phonecamon {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num:nums){
            set.add(num);
        }

        int answer = Math.min(nums.length / 2, set.size());

        return answer;
    }

    public static void main(String[] args) {
        Phonecamon solution = new Phonecamon();
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution.solution(nums));
    }
}
