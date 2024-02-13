package arrayList;

import java.util.ArrayList;

public class insertElementIntoFirstPosition {
    public static void main(String[] args){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(9);
        ar.add(10);
        ar.add(23);
        ar.add(0,21);
        System.out.println(ar);
        System.out.println(ar.get(1));// to get a particular element
        ar.set(2,11); //update an given element
        System.out.println(ar);
        for(Integer n :ar){
            System.out.println(n);
        }
        for(Object o:ar){
            System.out.println(o);
        }
    }
}
