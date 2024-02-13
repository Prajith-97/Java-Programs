package patterns;

public class numberPyramid {
    public static void main(String[] args){
       int n = 4;
       int space = n-1;
       for(int i = 0; i<n;i++){
           for(int j = 0; j<space;j++){
               System.out.print(" ");
           }
           space--;
           for(int x= 0;x<=i;x++){
               System.out.print(i+1);
               System.out.print(" ");
           }
           System.out.println(" ");
       }


    }
}
