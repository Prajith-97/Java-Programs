package stringPrograms;

import java.util.*;

public class removeCharacters {
    void removeChar(){
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Remove character string");
        String a = sc.nextLine();
        int[] array = new int[256];
        int i;
        for(i=0; i<a.length(); i++){
            array[a.charAt(i)]++;
            System.out.println(Arrays.toString(array));
        }
//        System.out.println(array);
        StringBuilder output= new StringBuilder();
        for(i=0; i<str.length(); i++){
            if(array[str.charAt(i)] == 0)
                output.append(str.charAt(i));
        }
        System.out.println(output);
    }
    public static void main(String[] args){
        removeCharacters obj = new removeCharacters();
        obj.removeChar();
    }
}
