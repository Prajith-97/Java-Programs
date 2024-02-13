package stringPrograms;

import java.util.HashMap;

public class wordCount {
    public static void main(String[] args) {
        String str = "my name is is prajith";
        String[] split = str.split(" ");
        int count = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s : split) {
            if (map.containsKey(s)) {
                map.put(s, count + 1);
            } else {
                map.put(s, count);
            }
        }
        System.out.println(map);
    }
}
