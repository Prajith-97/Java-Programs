package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hasmaptoLIst {
    public static void main(String[] args){
        Map<Integer, String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1, "Amal");
        hashMap.put(2, "Ammu");
        hashMap.put(3, "Aju");
        for (Map.Entry entry: hashMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        List<String> valueList = new ArrayList<String>(hashMap.values());
        List<Integer> keyList = new ArrayList<Integer>(hashMap.keySet());
        System.out.println(valueList);
        System.out.println(keyList);
    }
}
