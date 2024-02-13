package practiceDay2;

public class largest {
    static int num1 = 001;
    static int num2 = 230;
    static int num3=  100;
    static int largest;

    public static void main(String[] args){

        if (num1>num2){
            largest = num1;
        }else  {
            largest=num2;
        }
        if (largest>num3){
            System.out.println(largest );
        }
        else {
            System.out.println(num3);
        }
    }
}
