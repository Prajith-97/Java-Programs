package stringPrograms;

import java.util.Scanner;

public class concatenate {

    String merge(String a, String b ){
      String c = a+" "+b;
      return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String a= sc.nextLine();
        System.out.println("Enter second string");
        String b= sc.nextLine();
        concatenate obj = new concatenate();
        String z = obj.merge(a,b);
        System.out.println(z);
    }
}
