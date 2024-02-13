package samplePrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicateElements {
    public static void main(String[]  args){
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("john");
        ar.add("john");
        ar.add("jack");
        System.out.println(ar);
        HashSet<String>set = new HashSet<String>(ar);
        System.out.println(set);
    }
}
