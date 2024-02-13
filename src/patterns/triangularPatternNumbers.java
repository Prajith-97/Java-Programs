package patterns;

public class triangularPatternNumbers {
    void pattern() {
        int n = 10;
        int space = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int x = 1; x <= i ; x++) {

                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        triangularPatternNumbers obj = new triangularPatternNumbers();
        obj.pattern();
    }
}
