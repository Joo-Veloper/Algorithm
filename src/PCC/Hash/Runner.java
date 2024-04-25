package PCC.Hash;

import java.util.HashMap;

/* 참여한 선수는 1명 이상 100000명 이하
* completion길이는 Participant 길이보다 1작다
* 참가자 이름은 1개 이상 20개 이하의 알파벳 소문자
* 참가자 동명이인이 있다.*/
public class Runner {
    public static void main(String[] args) {
        Runner runner = new Runner();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = runner.solution(participant, completion);
        System.out.println("완주하지 못한 선수: " + answer);
    }

    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String string : completion) {
            hashMap.put(string, hashMap.getOrDefault(string, 0) + 1);
        }

        for (String string : participant) {
            if (hashMap.getOrDefault(string, 0) == 0) {
                return string;
            }
            hashMap.put(string, hashMap.get(string) - 1);
        }
        return null;
    }


}
