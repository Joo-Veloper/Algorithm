package PCC.RequiredGrammar;

import java.util.ArrayList;
import java.util.List;

/** 제네릭은 빌드 레벨에서 타입을 체크ㅏ여 타입 안정성을 제공하고, 타입 체크와 형변환을 생략할 수 있게 해주어 코드 간결
 * List를 정의할때 <Integer>와 같이 타입을 강제 하는것 = 제네릭
 */

public class Generic {
    public static void main(String[] args) {
        // Create a raw list
        List list = new ArrayList();
        list.add(10);
        list.add("abc");

        // Incorrect: You cannot add a string to an int directly
        // int sum1 = (int) list.get(0) + (int) list.get(1);

        // Create a generic list of integers
        List<Integer> genericList = new ArrayList<>();
        genericList.add(10);

        // Incorrect: You cannot add a string to an integer list
        // genericList.add("abc");

        // Correct: You can directly get integers from the list and perform operations
        int sum2 = genericList.get(0) + Integer.parseInt(list.get(0).toString());

        System.out.println("Sum: " + sum2);
    }
}