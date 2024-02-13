package stringPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class removeDuplicateCharacters {
    public static void main(String[] args){
        String str = "butter";
        char[] c = str.toCharArray();
        List<Character> ch = new ArrayList<Character>();
        for(Character z:c){
            ch.add(z);
        }
        HashSet<Character>charSet = new HashSet<Character>(ch);
        System.out.println(charSet);
    }
}
