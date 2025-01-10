package EAL._02_array;

import java.util.Scanner;

public class P03_Rock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n번의 게임
        int[] a = new int[n]; // A의 가위,바위,보 내역
        int[] b = new int[n]; // B의 가위,바위,보 내역

        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i]=sc.nextInt();
        }
        for(char x : solution(n, a, b).toCharArray()) {
            System.out.println(x);
        }

    }

    private static String solution(int n, int[] a, int[] b) {
        String answer = " ";

        for (int i = 0; i < n; i++) {
            if(a[i]==b[i]) {
                answer += "D";
            } else if(a[i]==1 && b[i]==3) {
                answer += "A";
            } else if(a[i]==2 && b[i]==1) {
                answer += "A";
            } else if(a[i]==3 && b[i]==2) {
                answer += "A";
            }else {
                answer += "B";
            }
        }
        return answer;
    }
}
