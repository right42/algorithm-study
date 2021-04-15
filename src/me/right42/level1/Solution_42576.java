package me.right42.level1;

import java.util.HashMap;
import java.util.Map;

public class Solution_42576 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> participantMap = new HashMap<>();
        Map<String, Integer> completionMap = new HashMap<>();

        for (String s : participant) {
            participantMap.putIfAbsent(s, participantMap.getOrDefault(s, 1) + 1);
        }

        for (String s : completion) {
            completionMap.putIfAbsent(s, completionMap.getOrDefault(s, 1) + 1);
        }

        for (String key : participantMap.keySet()) {
            if(completionMap.get(key) == null) {
                return key;
            }

            if (!participantMap.get(key).equals(completionMap.get(key))) {
                return key;
            }
        }
        return answer;
    }

}
