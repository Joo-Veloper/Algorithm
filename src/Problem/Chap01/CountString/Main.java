package Problem.Chap01.CountString;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class Main {
    private static final String TEXT = "Be strong, be fearless, be beautiful. "
            + "And believe that anything is possible when you have the right "
            + "people there to support you. ";
    private static final String TEXT_CP = TEXT + "😍 I love 💕 you Ӝ so much 💕 😍 🎼🎼🎼!";
    public static void main(String[] args) {
        System.out.println("Input text: \n" + TEXT + "\n");
        System.out.println("\n\nASCII or 16 bits Unicode charters (less than 65, 535(0xFFFF)) examples:\n");
        System.out.println("HashMap based solution:");
        long statTimeV1 = System.nanoTime();

        Map<Character, Integer> duplicatesV1 = Strings.countDuplicateCharactersV1(TEXT);
        displayExecutionTime(System.nanoTime() - statTimeV1);
        System.out.println(Arrays.toString(duplicatesV1.entrySet().toArray()));

        System.out.println();
        System.out.println("Java 8, functional-style solution:");
        long startTimeV2 = System.nanoTime();

//        Map<Character, Long> duplicatesV2 = Strings.countDuplicateCharactersV2(TEXT);
//
//        displayExecutionTime(System.nanoTime() - startTimeV2);
//        System.out.println(Arrays.toString(duplicatesV2.entrySet().toArray()));
    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time: " + time + " ns" + " (" +
                TimeUnit.MICROSECONDS.convert(time, TimeUnit.NANOSECONDS) + "ms");
    }

}
