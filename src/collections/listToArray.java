package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listToArray {
    public static void main(String[] args){
        ArrayList <Integer> li = new ArrayList<Integer>();
        li.add(8);
        li.add(9);
        li.add(10);
        Integer[] arr = new Integer[li.size()] ;
        li.toArray(arr);
        System.out.println(Arrays.toString(arr));

        String[] ar = new String[3];
        ar[0]="abc";
        ar[1]="ab";
        ar[2]="a";
        System.out.println((Arrays.toString(ar)));
        List<String>liStr = new ArrayList<String>(Arrays.asList(ar));
        System.out.println(liStr);


    }
}
