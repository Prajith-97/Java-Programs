package practiceDay8;

public class reverseNumberUsingRecursion {
    static  int  rev = 0;
    public static void main(String[] args) {
        int a = reverse(32,2);
        System.out.println(a);
    }
    public static int reverse(int num, int len){
        if (len == 1) {
            return num;
        }else{
            int mod = num%10;
            num=num/10;
            return (int) (mod*Math.pow(10,len-1))+reverse(num,--len);
        }
    }

}
