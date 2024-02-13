package practiceDay2;

public class root {
    static int a = 3;
    static int b = 4;
    static int c = -9;

    public static void main(String[] args) {
       int determinant = (b*b)-(4*a*c);
       if(determinant>0){
           double root1 = (-b+Math.sqrt(determinant))/(2*a*c);
           double root2 = (-b-Math.sqrt(determinant))/(2*a*c);
           System.out.println(root1);
           System.out.println(root2);
       }
    }
}
