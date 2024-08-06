package BaekJ.sort;

import java.util.*;
public class SortWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] word = new String[n];

        for (int i = 0; i < n; i++) {
            word[i] = sc.nextLine();
        }

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }else{
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(word[0]);
        for(int i = 1; i < n; i++) {
            if (!word[i].equals(word[i - 1])) {
                System.out.println(word[i]);
            }
        }
    }
}
