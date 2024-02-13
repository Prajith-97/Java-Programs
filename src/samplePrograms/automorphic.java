package samplePrograms;

public class automorphic {

    public static void main(String[] args) {
        int num = 76;
        int sqNum = num * num;
        int rev = 0;
        int sqRev = 0;
        int len = (int) (Math.log10(num) + 1);
        int sqLen = (int) (Math.log10(sqNum)+1);
        for (int i=0; i<(len-1);i++) {
            int modulus = num%10;
            rev = rev*10+modulus;
            num = num/10;
        }
        for (int i = 0; i<(len-1);i++){
            int modulus = sqNum%10;
            sqRev = sqRev*10+modulus;
            sqNum = sqNum/10;
        }
       if(rev == sqRev){
           System.out.println("Entered number is an automorphic number");
       }
       else {
           System.out.println("Entered number is not an automorphic number");
       }
    }
}
