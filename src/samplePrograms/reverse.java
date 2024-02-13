package samplePrograms;

public class reverse {
    public static void main(String[] args){
        int num = 132;
        int rev = 0;
        int len =  (int) (Math.log10(num) + 1);
        for (int i = 0; i<len; i++){
            int modulus = num%10;
            rev = rev*10+modulus;
            num = num/10;
        }
        System.out.println(rev);

    }
}
