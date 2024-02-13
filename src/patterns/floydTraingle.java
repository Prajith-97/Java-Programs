package patterns;

public class floydTraingle {
    int num=1;
    void pattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    void number(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
                System.out.println("");
        }
    }

    public static void main(String[] args){
        floydTraingle obj = new floydTraingle();
        obj.number();

    }
}
