package CodingTest.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Heap {
    /*
     * 1. 배열에 정수 x(!=0)을 넣는다.
     * 2. 배열에서 절대값이 가장 작은 값을 출력한 후 그 값을 배열에서 제거한다.
     * 절대값이 가장 작은 값이 여러개일 경우 그 중 가장 작은수를 출력해 그값을 배열에서 제거한다.
     * 프로그램은 처음에 비어 있는 배열에서 시작한다. 절댓값 힙을 구현*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) -> {
        int first_abs = Math.abs(o1);
        int second_abs = Math.abs(o2);
        if (first_abs == second_abs) {
            return o1 > o2 ? 1 : -1;
        } else {
            return first_abs - second_abs;
        }
    });
        for (int i = 0; i < N ; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (MyQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(MyQueue.poll());
                }
            } else {
                MyQueue.add(request);
            }
        }
    }
}
