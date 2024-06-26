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
    /** public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        spira(n);
    }

    static void spira(int n) {
        for (int i = 1; i <= n; i++) {                    // i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= n - i; j++)            // n - i 개의 ' ' 을 출력
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)    // (i - 1) * 2 + 1 개의 '*' 을 출력
                System.out.print('*');
            System.out.println();                                    // 줄바꿈
        }
    }*/

    // 연습 16
    public static void main(String[] args) {
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
    }
}

