package practiceDay8;

public class doWhileLoop {
    public static void main(String[] args){
        int num = 456;
        int len = (int)Math.log10(num)+1;
        int n=num;
        int rev=0;
        int sum=0;
        int i=0;
        do {
            int mod = num%10;
            sum+=mod;
            rev=rev*10+mod;
            num/=10;
            i++;
        }while (i<len);
        System.out.println(sum);
        System.out.println(rev);
    }
}
