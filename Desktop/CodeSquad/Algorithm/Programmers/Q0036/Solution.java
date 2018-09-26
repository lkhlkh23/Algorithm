package Q0036;

import java.util.*;

public class Solution {
    /* 카카오 오픈채팅방
     *     Url : https://programmers.co.kr/learn/courses/30/lessons/42888 */
    public static String[] solution(String[] record) {
        /* Time Over */
        String[] answer;
        Map<String, String> userMap = new HashMap<>(); // <uid, nickname>
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < record.length && !record[i].equals(""); i++) {
            String[] command = record[i].split(" ");
            if (command[0].equals("Enter")) {
                userMap.put(command[1], command[2]);
                sb.append("@").append(command[1]).append("@님이 들어왔습니다.\t");
            } else if (command[0].equals("Leave")) {
                sb.append("@").append(command[1]).append("@님이 나갔습니다.\t");
            } else {
                userMap.put(command[1], command[2]);
            }
        }

        Iterator<String> it = userMap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = userMap.get(key);
            int idx = 0;
            while ((idx = sb.indexOf("@" + key + "@")) > -1) {
                sb.replace(idx, idx + key.length() + 2, value);
            }
        }

        answer = sb.toString().split("\t");

        return answer;
    }

    public static String[] solution2(String[] record) {
        /* 정답 */
        Map<String, String> userMap = new HashMap<>(); // <uid, nickname>
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < record.length && !record[i].equals(""); i++) {
            String[] command = record[i].split(" ");
            if (command[0].equals("Enter")) {
                userMap.put(command[1], command[2]);
                resultList.add("@" + command[1] + "@님이 들어왔습니다.");
            } else if (command[0].equals("Leave")) {
                resultList.add("@" + command[1] + "@님이 나갔습니다.");
            } else {
                userMap.put(command[1], command[2]);
            }
        }

        List<String> answerList = new ArrayList<>();
        for (int i = 0; i < resultList.size(); i++) {
            String[] splited = resultList.get(i).split("@");
            answerList.add(userMap.get(splited[1]) + splited[2]);
        }

        int cnt = 0;
        String[] answer = new String[resultList.size()];
        for (String str : answerList) {
            answer[cnt++] = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan", "Leave uid1234", "Change uid4567 Ryan"};
        record = solution(record);
        for (int i = 0; i < record.length; i++)
            System.out.println(record[i]);

    }
}