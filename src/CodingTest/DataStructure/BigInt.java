package CodingTest.DataStructure;

import java.io.*;
import java.util.Stack;

// 크기가 N인 수열 A = A1-An 이 있다. 수열의 각 원소 A에 관련된 오큰수 NGE(i)를 구하려고 한다.
// A의 오큰수는 오른쪽에 있으며 A보다 큰 수 중 가장 왼쪽에 있는 수를 의미한다. 이러한 수가 없을때 오큰수 -1이다.
// 예를 들어 A[3, 5, 2, 7]일때 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1
// A는 [9,5,4,8]일 경우에 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.
public class BigInt {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[]A = new int[n];
        int[]ans = new int[n];
        String[] str = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> myStack = new Stack<>();
        myStack.push(0);
        for (int i = 1; i < n; i++) {
            while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
                ans[myStack.pop()] = A[i];
            }
            myStack.push(i);
        }
        while (!myStack.empty()) {
            ans[myStack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
