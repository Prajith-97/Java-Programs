package Arrays;

import java.util.Arrays;

public class largestTwoDigitNumber {
    void large(){
        int[] ar = {1, 22, 234, 23, 2455, 255, 99};
        int[] twoDigitNumbers = new int[ar.length];

        int large=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>=10&&ar[i]<100){
                twoDigitNumbers[i]=ar[i];
            }
        }
        for(int i=0;i<twoDigitNumbers.length-1;i++){
            if(twoDigitNumbers[i]>twoDigitNumbers[i+1]){
                large=ar[i];
            }else {
                large=ar[i+1];
            }
        }
        System.out.println(large);
    }
    public static void main(String[] args){
        largestTwoDigitNumber obj = new largestTwoDigitNumber();
        obj.large();
    }

}
