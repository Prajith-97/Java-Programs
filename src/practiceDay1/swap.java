package practiceDay1;

public class swap {
    public static void main(String[] args){
        int a = 123;
        int b = 321;
        int temp =0;
        temp = b;
        b=a;
        a=temp;
        System.out.println("After swap value of a = " +a);
        System.out.println("After swap value of b = " +b);
    }
}
