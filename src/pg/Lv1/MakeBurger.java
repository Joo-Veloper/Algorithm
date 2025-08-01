package pg.Lv1;

import java.util.Stack;

public class MakeBurger {
    public static int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int ing : ingredient) {
            stack.push(ing);

            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 &&
                        stack.get(size - 3) == 2 &&
                        stack.get(size - 2) == 3 &&
                        stack.get(size - 1) == 1) {

                    for (int i = 0; i < 4; i++) {
                        stack.pop();
                    }
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] test2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};

        System.out.println(solution(test1));
        System.out.println(solution(test2));
    }
}
