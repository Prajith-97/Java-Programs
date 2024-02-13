package samplePrograms;

import java.util.Scanner;

public class countNumbers {

    public static void main(String[] args){
        System.out.println("Enter an number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int length = (int) (Math.log10(num)+1);
        System.out.println(length);
    }
}
