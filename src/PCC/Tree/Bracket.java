package PCC.Tree;

public class Bracket {
    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        int n = 8;
        int a = 4;
        int b = 7;
        int result = bracket.solution(n, a, b);
        System.out.println(result);
    }
    public int solution (int n, int a, int b) {
        int answer;

        for (answer = 0; a != b; answer++) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
        }
        return answer;
    }
}
