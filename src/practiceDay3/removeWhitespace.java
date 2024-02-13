package practiceDay3;

public class removeWhitespace {
     public static void main(String[] args){
         String str = "hi    how are you ?";
         String newStr  = str.replaceAll(" ","");
         System.out.println(newStr);
         }
}
