package practiceDay7;

public class checkPrimeNumberRecursion {
    static int  flag =0;

    public static void main(String[] args) {
        checkPrime(6, 2);
        if (flag==1){
           System.out.println("Entered number is prime number");
        }else {
            System.out.println("Entered number is not a prime number");
        }
    }

    public static int checkPrime(int num, int  limit) {
        if (num > limit) {
            if (num%limit!=0) {
                return checkPrime(num,++limit);
            }
            else {
                return flag=0;
            }
        }
        return flag=1;
    }

}