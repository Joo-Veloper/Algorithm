package CodingTest.DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CardGame {
    // 1번이 가장 위
    // N이 가장 아래
    // 같은 동작을 카드가 1장 남을때 까지 반복
    // 가장 위에 있는 카드 버린다.
    // 가장 위에 있는 카드를 가장 아래에 있는 카드 밑으로 옮긴다.
    // 예를 들어 N = 4이라면 1,2,3,4 순서 예상
    // 1을 버리면 234가 남고 2를 가장 아래로 옮기면 순서는 342가된다. 3을 버리면 42가 되고 4를 밑으로 옮기면 24가 된다 이렇게
    // 마지막 숫자를 구하시오
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 1; i <= N ; i++) {
            myQueue.add(i);
        }
        while (myQueue.size() > 1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.poll());

    }
}
