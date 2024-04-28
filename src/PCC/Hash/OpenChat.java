package PCC.Hash;

import java.util.ArrayList;
import java.util.HashMap;

public class OpenChat {
    public static void main(String[] args) {
        OpenChat openChat = new OpenChat();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] result = openChat.solution(record);
        for (String res : result) {
            System.out.println(res);
        }
    }
    public String[] solution(String[] record) {
        HashMap<String, String> msg = new HashMap<>();
        msg.put("Enter", "님이 들어왔습니다.");
        msg.put("Leave", "님이 나갔습니다.");

        HashMap<String, String> uid = new HashMap<>();

        for (String string : record) {
            String[] cmd = string.split(" ");
            if (cmd.length == 3) {
                uid.put(cmd[1], cmd[2]);
            }
        }
        ArrayList<String> answer = new ArrayList<>();
        for (String string : record) {
            String[] cmd = string.split("");
            if (msg.containsKey(cmd[0])) {
                answer.add(uid.get(cmd[1] + msg.get(cmd[0])));
            }
        }
        return answer.toArray(new String[0]);
    }
}
