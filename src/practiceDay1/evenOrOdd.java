package practiceDay1;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a number");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("Enter a number is even");
            } else {
                System.out.println("Enter a number is odd");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}