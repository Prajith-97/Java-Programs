package stringPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class occurrence {
    public static void main(String[] args) {
        String str = "jsp skdjfhfhfpp";
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] charAr=str.toCharArray();
        for(char c:charAr){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else {
                charCountMap.put(c,1);
            }

        }

        System.out.println(charCountMap);
    }
}


