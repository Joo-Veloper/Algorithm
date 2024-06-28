package BaekJ.math1;

import java.util.Scanner;

public class Formation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();

        long result = 0;
        int exponent = 0;
        int num = 0;
        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = ch - '0';
            } else {
                num = ch - 55;
            }
            result += num * Math.pow(B, exponent++);
        }
        System.out.println(result);
    }
}

/*### 진법 변환 개요

진법 변환은 한 진법의 숫자를 다른 진법의 숫자로 변환하는 과정을 말합니다. 이 문제에서는 B진법으로 주어진 숫자를 10진법으로 변환하는 방법을 설명하고자 합니다.

### B진법에서 10진법으로 변환

B진법 숫자를 10진법으로 변환하는 과정은 다음과 같습니다:
1. 숫자의 각 자리에 대해 해당 자릿수의 값을 구하고
2. 이를 각 자리의 가중치(진법의 거듭제곱)를 곱한 후
3. 모든 자리의 값을 더하면 됩니다.

### 진법의 자리와 가중치

각 자릿수의 가중치는 해당 자리의 값에 진법의 거듭제곱을 곱한 값입니다. 예를 들어, \( B \)진법의 숫자 \( N \)의 각 자릿수는 다음과 같이 표현됩니다:
\[ N = d_k \cdot B^k + d_{k-1} \cdot B^{k-1} + \cdots + d_1 \cdot B^1 + d_0 \cdot B^0 \]

여기서 \( d_i \)는 i번째 자릿수의 값입니다.

### 예제 설명

#### 예제 입력: `ZZZZZ 36`

입력된 B진법 수는 `ZZZZZ`이며, 이는 36진법 수입니다. 이를 10진법으로 변환하기 위해 각 자리의 값을 10진법으로 바꾸고 가중치를 곱한 후 더합니다.

1. 각 자릿수의 10진법 값:
   - Z: 35 (알파벳 Z는 10 + 25 = 35)

2. 36진법 수 `ZZZZZ`의 각 자릿수:
   - 왼쪽에서부터 차례대로 각 자릿수는 모두 Z이므로, 값은 35입니다.

3. 가중치 계산:
   - 가장 왼쪽 자리의 가중치는 \( 36^4 \)1,679,616 * 35 = 58,786,560
   - 그 다음 자리는 \( 36^3 \)46,656 * 35 = 1,632,960
   - 그 다음 자리는 \( 36^2 \)1296 * 35 = 45,360
   - 그 다음 자리는 \( 36^1 \)36 * 35 = 1260
   - 가장 오른쪽 자리는 \( 36^0 \)0 35 * 1 = 35

*/
