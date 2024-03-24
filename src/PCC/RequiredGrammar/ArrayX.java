package PCC.RequiredGrammar;

/**
 * 시간 복잡도
 * N은 행 열 길이 -> 행과 열 길이는 같다. arr1의 행과 열 수를 r1, c1라고 할때 arr2의 행과 열 수를 r2, c2 라고 했을때 r1*c1*c2 연산
 * 최종 시간복잡도는 o(b^3)
 */
public class ArrayX {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length;
        int c1 = arr1.length;
        int r2 = arr2.length;
        int c2 = arr2.length;

        int[][] answer = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    answer[i][i] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

}
