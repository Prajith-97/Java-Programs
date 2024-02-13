package practiceDay1;

import java.util.Scanner;

public class asciiValue {
    public static void main(String[] args){
        try {
            System.out.println("Enter a character");
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(11);
            int value = (int) ch; // type casting
            System.out.println(value);
        }catch (Exception e){
            System.out.println(1);
        }

    }
}
