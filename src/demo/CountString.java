package demo;

import java.util.HashMap;
import java.util.Map;

public class CountString {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "aaaaaaaaaaasffasdqweqweadeq13asdasdasd";
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                Integer num = map.get(str.charAt(i));
                map.replace(str.charAt(i), num + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        System.out.println(map);
    }
}
