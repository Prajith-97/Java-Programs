package samplePrograms;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an number");
        int num = 121;
        int rev = 0; // reversed number
        int rem;   // remainder
        int n = num;

        while(n>0){

            rem = num%10;
            rev = (rev*10) + rem;
            n = num/10;
        }
        if (rev==num){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
