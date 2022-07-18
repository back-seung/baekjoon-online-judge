package string;

import java.util.HashMap;
import java.util.Map;

public class B1157Re {
    public static void main(String[] args) {
        String text = "baaa";
        text = text.toUpperCase();
        int count = 1;
        Map<Character, Object> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, Integer.parseInt(map.get(c).toString()) + 1);
            } else {
                map.put(c, count);
            }
        }

        int max = 0;
        int nope = 0;
        String answer = "";
        for (char c : map.keySet()) {
            if ((int) map.get(c) > max) {
                max = (int) map.get(c);
                answer = String.valueOf(c);
            } else if ((int) map.get(c) == max) {
                nope++;
            }
        }
        if (nope != 0) {
            System.out.println("?");
        } else {
            System.out.println(answer);
        }
    }
}
