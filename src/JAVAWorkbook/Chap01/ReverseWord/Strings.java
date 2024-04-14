package JAVAWorkbook.Chap01.ReverseWord;

import java.util.regex.Pattern;

public class Strings {
    private static final Pattern PATTERN = Pattern.compile(" +");
    private static final java.lang.String WHITESPADE = " ";

    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static java.lang.String reverseWords(java.lang.String str) {
        if (str == null || str.isBlank()) {
            return "";
        }
        java.lang.String[] words = str.split(WHITESPADE);
        StringBuilder reversedString = new StringBuilder();

        for (java.lang.String word : words) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            reversedString.append(reverseWord).append(WHITESPADE);
        }

        // 마지막 공백 제거
        if (reversedString.length() > 0 && reversedString.charAt(reversedString.length() - 1) == ' ') {
            reversedString.deleteCharAt(reversedString.length() - 1);
        }

        return reversedString.toString();
    }
}
