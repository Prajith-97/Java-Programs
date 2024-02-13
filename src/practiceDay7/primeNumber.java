package practiceDay7;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int flag =0;
        System.out.println("Enter an number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 2; i<num/2;i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Enter an number is not an prime number");
        }else{
            System.out.println("Enter an number is a prime number");
        }

    }
}
