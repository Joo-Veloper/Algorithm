package EAL._06_Sorting_Searching;

import java.util.Scanner;

public class P04_LRU {
    public static int[] solution(int size, int n, int[] arr){
        int[] cache=new int[size];
        for(int x : arr){
            int pos=-1;
            for(int i=0; i<size; i++) if(x==cache[i]) pos=i;
            if(pos==-1){
                for(int i=size-1; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }
            else{
                for(int i=pos; i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }
            cache[0]=x;
        }
        return cache;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        for(int x : solution(s, n, arr)) {
            System.out.print(x + " ");
        };
    }

}
