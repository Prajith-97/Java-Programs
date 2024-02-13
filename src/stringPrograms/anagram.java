package stringPrograms;

import java.util.Arrays;

public class anagram {
    void checkAnagram() {
        String str1 = "owl";
        String str2 = "low";
        if (str1.length() == str2.length()) {
            char[] ar = str1.toCharArray();
            char[] a = str2.toCharArray();
            Arrays.sort(ar);
            System.out.println(ar);
            Arrays.sort(a);
            boolean result = Arrays.equals(ar, a);
            if (result) {
                System.out.println("anagram");
            }
        }
    }
    public static void main(String[] args){
        anagram obj = new anagram();
        obj.checkAnagram();
    }
}
