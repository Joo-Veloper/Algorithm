package JAVAWorkbook.Chap01.FirstNonRepeated;

public class FindCharacters {
    private static final int EXTENDED_ASCII_CODES = 256;

    public char firstNonRepeatedCharacter(String str) {
        int[] flags = new int[EXTENDED_ASCII_CODES];

        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }
        int position = Integer.MAX_VALUE;

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }
        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
    }
    public static void main(String[] args) {
        FindCharacters finder = new FindCharacters();
        String testString = "hello"; // 이 문자열에서 첫 번째로 반복되지 않는 문자를 찾을 것입니다.

        char result = finder.firstNonRepeatedCharacter(testString);
        if (result != Character.MIN_VALUE) {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}


