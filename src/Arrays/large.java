package Arrays;

public class large {
    public static void main(String[] args) {
        int[] ar = {1, 20,9,10, 2};
        int large = ar[0];
        for(int i=0;i<ar.length;i++){
            if(large<ar[i]){
                large=ar[i];
            }
        }
        System.out.println(large);
    }
}
