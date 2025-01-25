package EAL._02_array;

import java.util.ArrayList;
import java.util.Scanner;

public class P06_InvertedPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(N, arr)) {
            System.out.print(x + " ");
        }
    }

    public static boolean isPrime(int num){
        if(num==1) {
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp=arr[i];
            int res=0;
            while(tmp>0){
                int t=tmp%10;
                res=res*10+t;
                tmp=tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }
}


