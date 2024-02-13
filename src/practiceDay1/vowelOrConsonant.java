package practiceDay1;

import java.util.Scanner;

public class vowelOrConsonant {
    public void alphabet(char c) {
        try {
            char ch = Character.toUpperCase(c);
            if (ch == 'A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        vowelOrConsonant obj = new vowelOrConsonant();
        System.out.println("Enter an alphabet");
        Scanner sc  =new Scanner(System.in);
        char c = sc.next().charAt(0);
        obj.alphabet(c);
    }
}
