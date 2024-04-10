package PCC.Stack;

import java.util.Stack;

public class ClawMachineGame {
    public static void main(String[] args) {


    }

    public int game(int[][] board, int[] moves) {
        Stack<Integer>[] lanes = new Stack[board.length];
        for (int i = 0; i < lanes.length; i++) {
            lanes[i] = new Stack<>();
        }
        for (int i = board.length - 1; i >= 0; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 0) {
                    lanes[j].push(board[i][j]);
                }
            }
        }
        Stack<Integer> bucket = new Stack<>();

        int answer = 0;

        for (int move : moves) {
            if (!lanes[move - 1].isEmpty()) {
                int doll = lanes[move - 1].pop();
                if (!bucket.isEmpty() && bucket.peek() == doll) {
                    bucket.pop();
                    answer += 2;
                } else {
                    bucket.push(doll);
                }
            }
        }
        return answer;
    }
}
