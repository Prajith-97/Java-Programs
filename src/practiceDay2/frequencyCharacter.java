package practiceDay2;

import java.util.ArrayList;
import java.util.Scanner;

public class frequencyCharacter {

    public static void frequency(){
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        ArrayList al = new ArrayList();
        char c;
        for(int i=0;i<length;i++){
            int count =0;
            if(al.contains(str.charAt(i))){
                System.out.println("Already counted the frequency of the character" +str.charAt(i) );
            }else {
                al.add(str.charAt(i));
                c = str.charAt(i);
                for(int j=i;j<length;j++){
                    if(c==str.charAt(j)){
                        count = count+1;
                    }
            }
            System.out.println("frequency of character" +c+ "==" +count);
            }

        }
    }

    public static void main(String[] args){
        frequency();
    }
}
