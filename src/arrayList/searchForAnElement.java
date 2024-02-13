package arrayList;

import java.util.ArrayList;

public class searchForAnElement {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(9);
        ar.add(10);
        ar.add(23);
//        for(Integer n : ar){
//            if(n==23){
//                System.out.println("Element Found");
//            }
//        }
        if(ar.contains(23)){
            System.out.println("Element Found");
        }
    }
}
