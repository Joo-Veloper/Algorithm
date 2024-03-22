package PCC.RequiredGrammar;

import java.util.ArrayList;
import java.util.List;

/** 제네릭은 빌드 레벨ㄹ에서 타입을 체크ㅏ여 타입 안정성을 제공하고, 타입 체크와 형변환을 생략할 수 있게 해주어 코드 간결
 * List를 정의할때 <Integer>와 같이 타입을 강제 하는것 = 제네릭
 */

public class Generic {
    List list = new ArrayList();
    list.add(10);
    list.add("abc");

    int sum1 = (int)list.get(0) + (int)list.get(1);

    List<Integer> genericList = new ArrayList<>();
    genericList.add(10);
    genericList.add("abc");

    int sum2 = genericList.get(0) + genericList.get(1);
}
