package stringPrograms;

import java.util.ArrayList;

public class anagramPractice {
    public static void main(String[] args){
        String str1= "Dormitory";
        String str2 = "Dirty";
        ArrayList<Character>ar1 = new ArrayList<Character>();
        ArrayList<Character>ar2 = new ArrayList<>();
        boolean anagram = true;
        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            if(ar1.contains(c)){
                System.out.println("character is present in array list");
            }else{
                ar1.add(c);
            }
        }
        for(int i=0;i<str2.length();i++){
            char c = str2.charAt(i);
            if(ar2.contains(c)){
                System.out.println("character is present in array list");
            }else{
                ar2.add(c);
            }
        }
        for(int i =0;i<ar1.size();i++){
            char c = ar1.get(i);
            if(ar2.contains(c)){
                anagram=true;
            }else{
                anagram=false;
            }
        }
        if(anagram==false){
            System.out.println("Entered strings are not an anagram");
        }else{
            System.out.println("Entered strings are anagram");
        }
    }
}
