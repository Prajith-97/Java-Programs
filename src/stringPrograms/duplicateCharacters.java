package stringPrograms;

import java.util.ArrayList;

public class duplicateCharacters {
    public static void main(String[] args){
        String str = "Betttrh Buttrv";
        int len = str.length();
        ArrayList <Character> ch = new ArrayList<>();
        for(int i=0;i<=len-1;i++){
            int count=0;
            char c = str.charAt(i);
            for (int j = len -1; j >= 0; j--) {
                if (c == str.charAt(j)) {
                    count++;

                }
            }
            ch.add(c);
            System.out.println(c +"---"+count);
            }

        }
    }
//}
