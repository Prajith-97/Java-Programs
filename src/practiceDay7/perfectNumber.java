package practiceDay7;

import java.util.ArrayList;

public class perfectNumber {
    public static void main(String[] args){
        int num=496;
        int sum=0;
        ArrayList<Integer> ar = new ArrayList<>();
        int len = (int)Math.log10(num)+1;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                ar.add(i);
            }
        }
        for (Integer integer : ar) {
            sum = sum + integer;
        }
        if(sum==num){
            System.out.println("Entered number is an perfect number");
        }else {
            System.out.println("Entered number is not an perfect number");
        }
    }
}
