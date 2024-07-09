package revise;

import java.util.Scanner;

public class Remind2 {
    // 연습 1

    /**
     * public static void main(String[] args) {
     * Random rand = new Random();
     * <p>
     * System.out.println("키의 최댓값을 구합니다.");
     * int num = 1 + rand.nextInt(20);		// 사람 수를 1 ~ 20 사이의 난수로 정합니다
     * int[] height = new int[num];			// 요솟수가 num인 배열을 생성
     * <p>
     * System.out.println("사람 수는 " + num + "명입니다.");
     * System.out.println("키는 다음과 같습니다.");
     * for (int i = 0; i < num; i++) {
     * height[i] = 100 + rand.nextInt(90);      // 요솟값을 난수로 결정
     * System.out.println("height[" + i + "] : " + height[i]);
     * }
     * <p>
     * System.out.println("최댓값은 " + maxOf(height) + "입니다.");
     * }
     * private static int maxOf(int[] a){
     * int max = a[0];
     * for (int i = 0; i < a.length; i++) {
     * if (a[i] > max) {
     * max = a[i];
     * }
     * }
     * return max;
     * }
     */

    //연습 2
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요소수는");
        int n = sc.nextInt();

        // x 배열에 정수 n을 배열로 저장
        int[] x = new int[n];
        for (int i = 0; i < x.length; i++) {
            System.out.println("x [" + i + "] :");
            x[i] = sc.nextInt();
        }
        reverse(x);
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    private static void reverse(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a [ " + i + "] 와 a [" + (a.length - i - 1) + "]을 교환 합니다.");
            swap(a, i, a.length - i - 1);
            System.out.println(Arrays.toString(a));
        }
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }*/

    // 연습3 배열의 모든 요소의 합계를 구하여 반환하는 메서드 작성
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("모든 요소의 합계는 " + sumOf(arr) + "입니다.";
    }

    private static int sumOf(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }*/

    // 연습 4 배열 b의 모든 요소 복사
    /*public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numa = sc.nextInt();
        // 사용자로부터 배열 a의 크기를 입력받아 numa 변수에 저장합니다.
        int[] a = new int[numa];
        // 크기가 numa인 정수형 배열 a를 생성합니다.
        for (int i = 0; i < numa; i++) {
            // 배열 a의 모든 요소에 대해 반복합니다.
            System.out.print("a[" + i + "] : ");
            // 현재 인덱스 i의 값을 출력합니다.
            a[i] = sc.nextInt();
            // 사용자로부터 입력받은 값을 배열 a의 i번째 요소에 저장합니다.
        }
        int numb = sc.nextInt();
        // 사용자로부터 배열 b의 크기를 입력받아 numb 변수에 저장합니다.
        int[] b = new int[numb];
        // 크기가 numb인 정수형 배열 b를 생성합니다.
        for (int i = 0; i < numb; i++) {
            // 배열 b의 모든 요소에 대해 반복합니다.
            System.out.print("b[" + i + "] : ");
            // 현재 인덱스 i의 값을 출력합니다.
            b[i] = sc.nextInt();
            // 사용자로부터 입력받은 값을 배열 b의 i번째 요소에 저장합니다.
        }

        copy(a, b);
        // copy 메서드를 호출하여 배열 b의 요소를 배열 a에 복사합니다.

        System.out.println("배열 b의 모든 요소를 배열 a에 copy 하였습니다.");
        // 복사가 완료되었음을 알리는 메시지를 출력합니다.
        for (int i = 0; i < numa; i++)
            // 배열 a의 모든 요소에 대해 반복합니다.
            System.out.println("a[" + i + "] = " + a[i]);
        // 배열 a의 i번째 요소를 출력합니다.
    }

    static void copy(int[] a, int[] b) {
        // copy 메서드를 정의합니다. 이 메서드는 두 배열을 입력받아 하나의 배열에서 다른 배열로 요소를 복사합니다.
        int num = a.length <= b.length ? a.length : b.length;
        // a와 b 중 더 작은 길이를 num 변수에 저장합니다. 이는 두 배열 중 작은 길이만큼만 복사하기 위해서입니다.
        for (int i = 0; i < num; i++)
            // num 길이만큼 반복합니다.
            a[i] = b[i];
        // 배열 b의 i번째 요소를 배열 a의 i번째 요소에 복사합니다.
    }*/

    // 연습 5
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numa = sc.nextInt();
        int[] a = new int[numa];
        int numb = sc.nextInt();
        int[] b = new int[numb];

        for (int i = 0; i < numa; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < numb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = sc.nextInt();
        }
        rcopy(a,b);
        System.out.println("배열 b의 모든 요소를 배열 a에 copy 하였습니다.");

        for (int i = 0; i < numa; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }

    static void rcopy(int[] a, int[] b) {
        int num = Math.min(a.length, b.length);
        for (int i = 0; i < num; i++) {
            a[i] = b[b.length - i - 1];
        }
    }*/

    // 연습 6
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no < 0);
            do {
                System.out.print("어떤 진수로 변환할까요? (2~36):");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);
            dno = cardConv(no, cd, cno);
            System.out.print(cd + "진수로");
            for (int i = 0; i < dno; i++) {
                System.out.println(cno[i]);
            }
            System.out.println("입니다.");
            System.out.println("한번 더 할까요? (1. 예 / 2. 아니요) : ");
            retry = sc.nextInt();
        } while (retry == 1);
    }

    private static int cardConv(int no, int cd, char[] cno) {

    }*/
}