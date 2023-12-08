package Basic.Chap03;

public class GenericClassTest {
    static class GenericClass<T> {
        private T xyz;
        GenericClass(T t) {
            this.xyz = t;
        }
        T getXyz() {
            return xyz;
        }

        public static void main(String[] args) {
            GenericClass<String> s = new GenericClass<String>("ABC");
            GenericClass<Integer> n = new GenericClass<Integer>(15);

            System.out.println(s.getXyz());
            System.out.println(n.getXyz());
        }
    }
}
// <? extends T> :클래스 T의 하위 클래스를 전달받습니다.
// <? super T> : 클래스 T의 상위 클래스를 전달받습니다.