package stringPrograms;

import java.util.Arrays;

public class capitalizeFirstCharacter {
    void capitalize(){
        String str = "my name is prajith";
//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        sb.s


        for(int i=0;i<str.length();i++){
            String wo = Arrays.toString(str.split(""));
            System.out.println(wo);
        }

    }
    public static void main(String[] args){
        capitalizeFirstCharacter obj = new capitalizeFirstCharacter();
        obj.capitalize();
    }
}

