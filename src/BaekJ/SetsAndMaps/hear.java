package BaekJ.SetsAndMaps;


import java.util.*;

public class hear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 듣도 못한 사람의 수
        int M = sc.nextInt(); // 보도 못한 사람의 수
        sc.nextLine();

        HashSet<String> unheard = new HashSet<>();
        HashSet<String> unseen = new HashSet<>();

        //듣도 못한 사람
        for (int i = 0; i < N; i++) {
            unheard.add(sc.nextLine());
        }

        // 보도 못한 사람
        for (int i = 0; i < M; i++) {
            unseen.add(sc.nextLine());
        }

        unheard.retainAll(unseen);

        List<String> result = new ArrayList<>(unheard);
        Collections.sort(result);

        System.out.println(result.size());

        for (String name : result) {
            System.out.println(name);
        }
        sc.close();
    }
}
