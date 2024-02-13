package practiceDay5;

public class sumOfDigits {
    public static void main(String[] args){
        int num = 12345;
        int len = (int)Math.log10(num);
        int sum = 0;
        for(int i = 0; i<=len;i++){
            int modulus = num%10;
            sum = sum+modulus;
            num=num/10;
        }
        System.out.println(sum);
    }
}
