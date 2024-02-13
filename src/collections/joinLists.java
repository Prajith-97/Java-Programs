package collections;

import java.util.ArrayList;
import java.util.List;

public class joinLists {
    public static void main(String[] args){
        List <Integer> li = new ArrayList<Integer>();
        li.add(8);
        li.add(9);
        li.add(10);
        List <Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.addAll(li);
        System.out.println(list);
    }

}
