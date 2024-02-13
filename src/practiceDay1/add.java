package practiceDay1;

public class add {
     public void addTwoNumbers(int num1,int num2){
         try{
             int sum = num1+num2;
             System.out.println(sum);
         }catch (Exception e){
              e.printStackTrace();
         }

    }
    public static void main(String[] args){
         add obj = new add();
         obj.addTwoNumbers(1, Integer.parseInt("1a"));
    }
}
