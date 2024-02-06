package Problem.Chap01.CountString;

import java.util.*;

public class Strings {

    public static Map<Character, Integer> countDuplicateCharactersV1(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.emptyMap();
        }
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}
