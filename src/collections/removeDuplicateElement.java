package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicateElement {
    void removeElement() {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(12);
        ar.add(10);
        ar.add(23);
        ar.add(23);
        ar.add(9);
        ar.add(23);
        ar.add(23);
        ar.add(23);
        ar.add(23);
        ar.add(12);

        HashSet<Integer>uniqueSet = new HashSet<Integer>(ar);
        ArrayList<Integer>newArr=new ArrayList<>(uniqueSet);
        System.out.println(newArr);

    }
    public static void main(String[] args){
        removeDuplicateElement obj = new removeDuplicateElement();
        obj.removeElement();
    }
}
