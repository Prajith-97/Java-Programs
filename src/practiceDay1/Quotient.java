package practiceDay1;

public class Quotient {
        public void division(int num1,int num2) {
            try {
                int quo = num1 / num2;
//                int rem = num1-(quo*num2);
                int rem = num1%num2; //above statement will also work
                System.out.println(quo);
                System.out.println(rem);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public static void main(String[] args){
            Quotient obj = new Quotient();
            obj.division(3, 8);
        }

}
