package EAL;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class P10_ShortestCharacterDistance {
    private static Logger log = Logger.getGlobal();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();// 문자열
        char t = sc.next().charAt(0);// 문자
        for(int a : solution(s, t)) {
            System.out.print(a+ " ");
        }
    }

    private static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        s = s.toLowerCase();
        t = Character.toLowerCase(t);
        int p = 100;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i] = p;
                log.info("if distances: " + Arrays.toString(answer));
            }
            else{
                p++;
                answer[i]=p;
                log.info("else distances: " + Arrays.toString(answer));
            }
        }
        p=100;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==t){
                p = 0;
            }else{
                p++;
                answer[i]=Math.min(answer[i], p);
                log.info("Math.min: " + Arrays.toString(answer));
            }
        }
        return answer;
    }
}
