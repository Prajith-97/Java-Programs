package practiceDay7;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter an number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int len  = (int)Math.log10(num)+1;
        int armstrong = 0;
        for(int i=0;i<len;i++){
            int mod = num%10;
            System.out.println(mod);
            int power = (int) Math.pow(mod,len);
            armstrong = armstrong+power;
            num = num/10;
        }
        System.out.println(armstrong);
        if(armstrong==n){
            System.out.println("Entered number is an armstrong number");
        }
    }
}
