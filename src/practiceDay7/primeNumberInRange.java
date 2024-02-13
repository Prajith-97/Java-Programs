package practiceDay7;

import java.util.ArrayList;

public class primeNumberInRange {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        int first = 1;
        int flag = 0;
        int last = 10;

        for(int i = first; i<=last; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if(flag==1){
                System.out.println(i);
            }
        }
    }
}
