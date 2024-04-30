package PCC.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class BastA {
    // 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
    // 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
    // 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
    // 노래 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때,
    // 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 반환하는 solution작성

    public static void main(String[] args) {
        BastA bestA = new BastA();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] result = bestA.solution(genres, plays);
        for (int index : result) {
            System.out.println(index);
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<int[]>> genreMap = new HashMap<>();
        HashMap<String, Integer> playMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            if (!genreMap.containsKey(genre)) {
                genreMap.put(genre, new ArrayList<>());
                playMap.put(genre, 0);
            }
            genreMap.get(genre).add(new int[]{i, play});
            playMap.put(genre, playMap.get(genre) + play);
        }
        ArrayList<Integer> answer = new ArrayList<>();

        Stream<Map.Entry<String, Integer>> sortedGenre = playMap.entrySet().stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));
        sortedGenre.forEach(entry -> {
            Stream<int[]> sortedSongs = genreMap.get(entry.getKey()).stream()
                    .sorted((o1, o2) -> Integer.compare(o2[1], o1[1]))
                    .limit(2);
            sortedSongs.forEach(song -> answer.add(song[0]));

        });
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
