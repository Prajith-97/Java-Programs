package practiceDay1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class printInteger {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Enter an number");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(num);
        }catch (Exception e){
//            System.out.println(e);
            throw new InputMismatchException();
        }
    }
}
