package revise;

import Basic.Practice02.YMD;

import java.util.Scanner;

public class Remind {
    /** //연습 1
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a, b, c, d;
     System.out.println("네 정수의 최댓값을 구합니다.");
     System.out.print("a의 값 : ");
     a = sc.nextInt();
     System.out.print("b의 값 : ");
     b = sc.nextInt();
     System.out.print("c의 값 : ");
     c = sc.nextInt();
     System.out.print("d의 값 : ");
     d = sc.nextInt();
     int max = max4(a, b, c, d);
     System.out.println("최대값은 : " + max);
     }
     static int max4(int a, int b, int c, int d) {
     int max = a;
     if (b > max) {
     max = b;
     }
     if (c > max) {
     max =  c;
     }
     if (d > max) {
     max = d;
     }
     return max;
     }*/

    //연습 2
    /**public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a, b, c;
     System.out.println("최솟값을 구하세요");
     System.out.print("첫 번째 숫자를 입력하세요 : ");
     a = sc.nextInt();
     System.out.print("두 번째 숫자를 입력하세요 : ");
     b = sc.nextInt();
     System.out.print("세 번째 숫자를 입력하세요 : ");
     c = sc.nextInt();
     int min = min3(a, b, c);
     System.out.println(min);
     }

     static int min3(int a, int b, int c) {
     int min = a;
     if (a < min) {
     min = a;
     }
     if (b < min) {
     min = b;
     }
     if (c < min) {
     min = c;
     }
     return min;
     }*/

    // 연습 3

    /**
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("첫번째 숫자를 입력");
     * int a = sc.nextInt();
     * System.out.println("두번쨰 숫자 입력");
     * int b = sc.nextInt();
     * System.out.println("세 번쨰 숫자 입력");
     * int c = sc.nextInt();
     * System.out.println("네 번째 숫자 입력");
     * int d = sc.nextInt();
     * <p>
     * int min = min4(a, b, c, d);
     * System.out.println(min);
     * }
     * <p>
     * static int min4(int a, int b, int c, int d) {
     * int min = a;
     * if (b < min) {
     * min = b;
     * }
     * if (c < min) {
     * min = c;
     * }
     * if (d < min) {
     * min = d;
     * }
     * return min;
     * }
     */

    // 연습 4 - 세 값의 대소 관계인 13가지 조합의 중앙 값을 구하여 출력하는 프록르ㅐㅁ
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("세 정수의 중앙값을 구합니다.");
     System.out.print("a의 값 : ");
     int a = sc.nextInt();
     System.out.print("b의 값 : ");
     int b = sc.nextInt();
     System.out.print("c의 값 : ");
     int c = sc.nextInt();

     System.out.println(center(a, b, c));
     }*/
    // 1-1
    /** static int center(int a, int b, int c) {
     if (a >= b) {
     if (b >= c) {
     return b;
     } else if (a <= c) {
     return a;
     } else {
     return c;
     }
     } else if (a > c) {
     return a;
     } else if (b > c) {
     return c;
     }else {
     return b;
     }
     }*/
    //연습 5 1-2
    /** static int center(int a, int b, int c) {
     if ((b >= a && c <= a) || (b <= a && c >= a)) {
     return a;
     } else if ((a > b && c < b) || (a < b && c > b)) {
     return b;
     }
     return c;
     }*/

    // 연습 6
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("1부터 n까지의 합을 구합니다.");
     System.out.println("n 값: ");
     int n = sc.nextInt();

     int sum = 0;
     int i = 1;

     while (i <= n) {
     sum += i;
     i++;
     }
     System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
     }*/

    // 연습 7
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("1부터 n까지 정수 합");
     int n = sc.nextInt();

     int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
     System.out.println(sum);
     }*/

    // 연습 8
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("첫번째 숫자를 입력하세요");
     int a = sc.nextInt();
     System.out.println("두번째 숫자를 입력하세요");
     int b = sc.nextInt();
     int sumof = sumof(a, b);
     System.out.println(sumof);


     }

     static int sumof(int a, int b) {
     int min;
     int max;
     if (a < b) {
     min = a;
     max = b;
     } else {
     max = b;
     min = a;
     }
     int sum = 0;
     for (int i = min; i <= max; i++){
     sum += i;
     }
     return sum;
     }*/
    // 연습 9
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("a값 : ");
     int a = sc.nextInt();
     int b;
     while (true) {
     System.out.print("b값 : ");
     b = sc.nextInt();
     if (a < b) {
     break;
     }
     System.out.println("a보다 큰 값을 입력하세요");
     }
     System.out.println("b - a는 " + (b - a) + "입니다.");
     }*/
    // 연습 10
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("정수를 입력해주세요 : ");
     String a = sc.next();

     System.out.println("그 수는 " + a.length() + " 자리 입니다.");
     }*/

    // 연습 10-1
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n;
     do {
     n = sc.nextInt();
     } while (n <= 0);

     int no = 0;
     while (n > 0) {
     n /= 10;
     no++;
     }
     System.out.println("그 수는 " + no + " 자리 입니다.");
     }*/

    // 연습 11
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println("  | 1  2  3  4  5  6  7  8  9");
     System.out.println("--|--------------------------");
     for (int i = 1; i <= n; i++) {
     System.out.printf("%1d |", i);
     for (int j = 1; j <= 9; j++) {
     System.out.printf("%3d", i * j);
     }
     System.out.println();
     }
     }*/
    // 연습 12
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println("  | 1  2  3  4  5  6  7  8  9");
     System.out.println("--|--------------------------");
     for (int i = 1; i <= n; i++) {
     System.out.printf("%1d |", i);
     for (int j = 1; j <= 9; j++) {
     System.out.printf("%3d", i + j);
     }
     System.out.println();
     }
     }*/

    // 연습 13
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("정사각형을 출력합니다.");
     System.out.print("변의 길이");

     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {
     for (int j = 0; j < n; j++) {
     System.out.print("*");
     }
     System.out.println();
     }
     }*/
    // 연습 13 do - while
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n;

     do {
     System.out.print("변의 길이 : ");
     n = sc.nextInt();
     } while (n <= 0);

     for (int i = 0; i < n; i++) {
     for (int j = 0; j < n; j++) {
     System.out.print("*");
     }
     System.out.println();
     }
     }*/
    // 연습 14
    /** public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println("왼쪽 아래 직각삼각형");
     triangleLB(n);

     System.out.println("왼쪽 위 직각삼각형");
     triangleLU(n);

     System.out.println("오른쪽 위가 직각삼각형");
     triangleRU(n);

     System.out.println("오른쪽 아래가 직각삼각형");
     triangleRB(n);
     }

     static void triangleLB(int n) {
     for (int i = 1; i <= n; i++) {
     for (int j = 1; j <= i ; j++) {
     System.out.print("*");
     }
     System.out.println();
     }
     }

     static void triangleLU(int n) {
     for (int i = 1; i <= n; i++) {
     for (int j = 1; j <= n-i+1; j++) {
     System.out.print('*');
     }
     System.out.println();
     }
     }

     private static void triangleRU(int n) {
     for (int i = 1; i <= n; i++) {
     for (int j = 1; j <= i - 1; j++)
     System.out.print(' ');
     for (int j = 1; j <= n - i + 1; j++)
     System.out.print('*');
     System.out.println();
     }
     }

     private static void triangleRB(int n) {
     for (int i = 1; i <= n; i++) {
     for (int j = 1; j <= n - i; j++)
     System.out.print(' ');
     for (int j = 1; j <= i; j++)
     System.out.print('*');
     System.out.println();
     }
     }*/
    // 연습 15

    /**
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * spira(n);
     * }
     * <p>
     * static void spira(int n) {
     * for (int i = 1; i <= n; i++) {                    // i 행( i = 1, 2, ... , n )
     * for (int j = 1; j <= n - i; j++)            // n - i 개의 ' ' 을 출력
     * System.out.print(' ');
     * for (int j = 1; j <= (i - 1) * 2 + 1; j++)    // (i - 1) * 2 + 1 개의 '*' 을 출력
     * System.out.print('*');
     * System.out.println();                                    // 줄바꿈
     * }
     * }
     */

    // 연습 16
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        npira(num);
    }

    private static void npira(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++)
                System.out.print(' ');
            for (int j = 1; j <= (i-1)*2+1; j++)
                System.out.print(i % 10);
            System.out.println();
        }
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int essence;
        int dno;
        int re;
        char[] cno = new char[32];
        System.out.println("10진수를 기수 변환합니다.");

        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                n = sc.nextInt();

            } while (n < 0);
            do {
                System.out.print("어떤 진수로 변환할까요? (2~36):");
                essence = sc.nextInt();
            } while (essence < 2 || essence > 36);
            dno = cardConv(n, essence, cno);
            System.out.print(essence + "진수로는 ");
            for (int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.print("입니다.");
            System.out.print("한번 더 할까요? (예 - 1/ 아니요 - 0) : ");
            re = sc.nextInt();
        } while (re == 1);
    }

    private static int cardConv(int n, int essence, char[] cno) {
        int num = ((Integer) n).toString().length();
        int digits = 0;
        String d = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.printf(String.format("%%2d | %%%dd\n", n), essence, n);
        do {
            System.out.printf("   +");
            for (int i = 0; i < n + 2; i++)
                System.out.print('-');
            System.out.println();

            if (n / essence != 0)
                System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n),
                        essence, n / essence, n % essence);
            else
                System.out.printf(String.format("     %%%dd    ... %%d\n", n),
                        n / essence, n % essence);
            cno[digits++] = d.charAt(n % essence);
            n /= essence;
        } while (n != 0);

        for (int i = 0; i < digits/ 2; i++) {
            char temp = cno[i];
            cno[digits - i - 1] = temp;
        }
        return digits;
    }*/
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("A", 162, 0.3),
                new PhyscData("B", 173, 0.7),
                new PhyscData("C", 175, 2.0),
                new PhyscData("D", 171, 1.5),
                new PhyscData("E", 168, 0.4),
                new PhyscData("F", 174, 1.2),
                new PhyscData("G", 169, 0.8),
        };
        int[] vdist = new int[VMAX];

        System.out.println("■ 신체검사 리스트 ■");
        System.out.println(" 이름       키  시력 ");
        System.out.println("--------------------");
        for (int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n",
                    x[i].name, x[i].height, x[i].vision);

        System.out.printf("\n평균키 : %5.1fcm\n", PhyscData.aveHeight(x));

        PhyscData.distvision(x, vdist);

        System.out.println("\n시력의 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~ : ", i / 10.0);
            for (int j = 0; j < vdist[i]; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    static final int VMAX = 21;
    static class PhyscData{
        String name;
        int height;
        double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        static double aveHeight(PhyscData[] dat) {
            double sum = 0;

            for (int i = 0; i < dat.length; i++) {
                sum += dat[i].height;
            }
            return sum / dat.length;
        }

        // 시력 분포
        static void distvision(PhyscData[] dat, int[] dist) {
            int i = 0;

            dist[i] = 0;
            for (int j = 0; j < dat.length; j++) {
                if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                    dist[(int)(dat[i].vision * 10)]++;
            }
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("날짜를 입력하세요.\n");
        System.out.print("년 : ");
        int y = sc.nextInt();
        System.out.print("월 : ");
        int m = sc.nextInt();
        System.out.print("일 : ");
        int d = sc.nextInt();
        YMD date = new YMD(y, m, d);

        System.out.print("며칠 전/후의 날짜를 구할까요? : ");
        int n = sc.nextInt();

        YMD d1 = date.after(n);
        System.out.printf("%d일 후의 날짜는 %d년%d월%d일입니다.\n", n, d1.y, d1.m, d1.d);

        YMD d2 = date.before(n);
        System.out.printf("%d일 전의 날짜는 %d년%d월%d일입니다.\n", n, d2.y, d2.m, d2.d);


    }

    static class YMD {
        int y;        // 년
        int m;        // 월(1~12)
        int d;        // 일(1~31)

        static int[][] mdays = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},        // 평년
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},        // 윤년
        };

        static int isLeap(int year) {
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
        }

        YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        YMD after(int n) {
            YMD temp = new YMD(this.y, this.m, this.d);
            if (n < 0)
                return before(-n);

            temp.d += n;

            while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
                temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
                if (++temp.m > 12) {
                    temp.y++;
                    temp.m = 1;
                }
            }
            return temp;
        }

        YMD before(int n) {
            YMD temp = new YMD(this.y, this.m, this.d);
            if (n < 0)
                return after(-n);

            temp.d -= n;

            while (temp.d < 1) {
                if (--temp.m < 1) {
                    temp.y--;
                    temp.m = 12;
                }
                temp.d += mdays[isLeap(temp.y)][temp.m - 1];
            }
            return temp;
        }
    }
}