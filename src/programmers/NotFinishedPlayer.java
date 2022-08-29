package programmers;

import java.util.HashMap;
import java.util.Map;

public class NotFinishedPlayer {
    public static void main(String[] args) {
        String[] participant = {};
        String[] completion = {};
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        for (
                String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (
                String player : completion) {
            map.put(player, map.get(player) - 1);
        }
        for (
                String s : map.keySet()) {
            if (map.get(s) != 0) {
                answer = s;
                System.out.println(answer);
                break;
            }
        }
    }
}
