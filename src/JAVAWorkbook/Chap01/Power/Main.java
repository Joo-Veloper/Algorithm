package JAVAWorkbook.Chap01.Power;

import java.util.concurrent.TimeUnit;

public class Main {
    private static final String TEXT = " Illinois Mathematics";

    public static void main(String[] args) {

        System.out.println("Input text: \n" + TEXT + "\n");

        System.out.println("String.charAt() solution:");
        long startTimeV1 = System.nanoTime();

        Pair pairV1 = Strings.countVowelsAndConsonantsV1(TEXT);

        displayExecutionTime(System.nanoTime() - startTimeV1);
        System.out.println("Vowels: " + pairV1.vowels);
        System.out.println("Consonants: " + pairV1.consonants);

        System.out.println();
        System.out.println("functional-style solution:");
        long startTimeV2 = System.nanoTime();

        Pair pairV2 = Strings.countVowelsAndConsonantsV2(TEXT);

        displayExecutionTime(System.nanoTime() - startTimeV2);
        System.out.println("Vowels: " + pairV2.vowels);
        System.out.println("Consonants: " + pairV2.consonants);
    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time: " + time + " ns" + " ("
                + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }
}
