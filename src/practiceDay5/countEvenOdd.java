package practiceDay5;

import java.util.Scanner;

public class countEvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter an number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int length = (int) Math.log10(num);
        int evenCount = 0, oddCount = 0;
        for(int i = 0; i<=length; i++){
            int modulus = num%10;
            if(modulus%2==0){
                evenCount = evenCount+1;
            }else {
                oddCount = oddCount+1;
            }
            num = num/10;
        }
        System.out.println("Count of even numbers" +evenCount);
        System.out.println("Count of odd numbers" +oddCount);
    }
}
