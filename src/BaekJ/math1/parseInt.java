package BaekJ.math1;

public class parseInt {
    public static void main(String[] args) {
        try {
            int decimal = Integer.parseInt("100");
            int hexadecimal = Integer.parseInt("FF", 16);
            int binary = Integer.parseInt("1010", 2);

            System.out.println("10진수 : " + decimal);
            System.out.println("16진수 : " + hexadecimal);
            System.out.println("2진수 : " + binary);
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. " + e.getMessage());
        }
    }
}
// Integer.parseInt 는 Java에서 문자열을 정수로 반환하는 메서드 이 메서드는 주어진 문자열을 분석하여 int 타입의 숫자로 반환
/** nteger.parseInt 메서드를 사용할 때 주의해야 할 점은 다음과 같습니다.

 NumberFormatException:

 문자열이 숫자로 변환될 수 없는 경우 발생합니다.
 예: "abc"나 "123abc" 등
 java
 코드 복사
 try {
 int num = Integer.parseInt("abc");
 } catch (NumberFormatException e) {
 System.out.println("변환할 수 없는 문자열입니다.");
 }
 NullPointerException:

 입력 문자열이 null인 경우 발생합니다.
 java
 코드 복사
 try {
 int num = Integer.parseInt(null);
 } catch (NullPointerException e) {
 System.out.println("입력 문자열이 null입니다.");
 }
 진법 범위:

 radix 값은 Character.MIN_RADIX (2)에서 Character.MAX_RADIX (36) 사이여야 합니다.
 범위를 벗어나면 NumberFormatException이 발생합니다.
 참고 사항
 공백 처리: 문자열에 앞뒤 공백이 있는 경우 NumberFormatException이 발생하므로 trim()을 사용해 제거해야 합니다.
 음수 처리: 문자열이 음수 값을 포함할 경우, "-123"와 같은 형식으로 변환 가능합니다.*/