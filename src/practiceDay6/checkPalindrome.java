package practiceDay6;

public class checkPalindrome {
    public static void main(String[] args){
        int num = 121;
        int rev=0;
        int n= num;
        int length = (int)Math.log10(num);
        for(int i =0; i<=length;i++){
            int modulus = n%10;
            rev = rev*10+modulus;
            n=n/10;
        }
        if(num==rev){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
}
