package samplePrograms;

import java.util.Scanner;

public class chekAlphabet {

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter an value");
       char ch = sc.next().charAt(0);
       if (Character.isLetter(ch)){
           System.out.println("Entered value is an alphabet");
       }
       else {
           System.out.println("Entered value is not an alphabet");
       }

    }
}
