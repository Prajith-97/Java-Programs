package Arrays;

public class largest {
    void largestNumber(){
        int[] ar = {3,2,1};
        int large = ar[0];
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]>large){
                large=ar[i];
            }
        }
        System.out.println(large);
    }
    public static void main(String[] args){
            largest obj = new largest();
            obj.largestNumber();
    }
}
