package abstractFeatures;

public class outerClass {
    int x = 10;
    int y = 20;

    void sum(){
        int total = x+y;
        System.out.println(total);
    }
    static class inner{

        void test(){
            outerClass obj = new outerClass();
            obj.sum();
        }
    }
    public static void main(String[] args){
      inner o = new inner();
      o.test();
    }
}
