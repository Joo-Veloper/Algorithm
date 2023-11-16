### 숫자와 문자열 입력
```
import java.util.Scanner;
class A {
    public static void main(String[] args) {
        Scammer stdIn = new Scanner(System.in); //main 메서드의 앞에 작성
        stdin.nextInt() // 정수값 읽음
    }
}
```

### 숫자와 문자열 입력하기 2
 - **nextBoolean()** : boolean -> true & flase
 - **nextByte()** : byte = -128~ + 127
 - **nextShort()** : short = -32768 ~ +32767
 - **nextInt()** : int = -21억 ~ +21억
 - **nextLong()** : long = -9223372036854775808 ~ + 9223372036854775807
 - **nextFloat()** : float = +-3.40282347E+38 ~ +-1.40239846E-45
 - **nextDouble()** : double = +-1.79769313486231507E+378 ~ +-4.94065645841246544E-324
 - **next()** : String = 문자열 (공백, 줄 바굼 문자로 구분)
 - **nextLine()** : String = 문자열 1줄