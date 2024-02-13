package practiceDay6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class palindromeString {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter an character");
        StringBuilder rev = new StringBuilder();
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String str = br.readLine();
        int length = str.length();
        System.out.println(length);
        for(int i = length; i>0; i--){
            StringBuilder sb = new StringBuilder();
            rev.append(String.valueOf(sb.append(str.charAt(i - 1))));

        }
        System.out.println();
        if(str.equals(rev.toString())){
            System.out.println("palindrome");
        }
    }
}
