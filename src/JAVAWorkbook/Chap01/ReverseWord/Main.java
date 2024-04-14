package JAVAWorkbook.Chap01.ReverseWord;

import java.util.concurrent.TimeUnit;

public class Main {
    private static final java.lang.String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";

    public static void main(String[] args) {

        System.out.println("Input text: \n" + TEXT + "\n");

        System.out.println("Reverse words in Strings via StringBuilder:");
        long startTime = System.nanoTime();

        String reversed = Strings.reverseWords(TEXT);

        displayExecutionTime(System.nanoTime() - startTime);
        System.out.println("Reversed: \n" + reversed);
    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time: " + time + " ns" + " ("
                + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }
}

/*
* 공백을 구분자로 사용해 String.split 문자열을 단어 배열로 분할한다.
* 두번째 아스키코드로 각 단어를 뒤집은 후 String Builder에 결과를 덧붙인다. 먼저 주어진 문자열을 공백으로 분할한다.
* 이어서 생성한 단어 배열을 순회하며 charAt()으로 문자를 역순으로 가져와 단어를 뒤집는다.*/