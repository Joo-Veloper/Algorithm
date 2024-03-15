package Basic.Practice01;
/** if 문의 판단.
 * if((b>=a&& c<= a) || (b<= a&& c>=a)에 주목합니다.
 * 여기서 b>=a 및 v<=a 의 판단을 뒤집은 판단 (실질적으로 동일한 판단)이 계속하여, else 이후에서
 * else if ((a >b, && c < b) || (b<=a&& c>b)로 수행됩니다. 즉, 처음 if가 성립하지 않는경우,
 * 2번째 if에서도 (실질적으로) 같은 판단을 수행하므로, 효율이 나빠집니다.
 **/
public class Med3re {
    static int med3(int a, int b, int c){
        if ((b >= a && c <= a) || (b <= a && c >= a)) {
            return a;
        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        }return c;
    }
    public static void main(String[] args) {
        System.out.println("Med3(3,2,1) = " + med3(3,2,1));
        System.out.println("Med3(3,2,2) = " + med3(3,2,2));
        System.out.println("Med3(3,1,2) = " + med3(3,1,2));
        System.out.println("Med3(3,2,3) = " + med3(3,2,3));
        System.out.println("Med3(2,1,3) = " + med3(2,1,3));
        System.out.println("Med3(3,3,2) = " + med3(3,3,2));
        System.out.println("Med3(3,3,3) = " + med3(3,3,3));
        System.out.println("Med3(2,2,3) = " + med3(2,2,3));
        System.out.println("Med3(2,3,1) = " + med3(2,3,1));
        System.out.println("Med3(2,3,2) = " + med3(2,3,2));
        System.out.println("Med3(1,3,2) = " + med3(1,3,2));
        System.out.println("Med3(2,3,3) = " + med3(2,3,3));
        System.out.println("Med3(1,2,3) = " + med3(1,2,3));
    }
}
