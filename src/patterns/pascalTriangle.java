package patterns;

public class pascalTriangle {
    int n=10;
    int space=n-1;
    void pattern(){
        for(int i=0;i<n;i++){
           for(int j=0;j<space;j++){
               System.out.print(" ");
           }
           space--;
           for(int a=1;a<=(i*2)+1;a++){
               System.out.print("*");
           }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        pascalTriangle obj = new pascalTriangle();
        obj.pattern();
    }
}
