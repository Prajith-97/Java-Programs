package abstractFeatures;

public class outer {
    public int x = 20;
    void test(){
        inner obj= new inner();
        obj.printY();

    }
     static class inner{
        int y = 10;
        void printY(){
            System.out.println(y);
//            System.out.println(x);//not possible to access outer class non-static variable
        }
    }
    void displayY(){
//        System.out.println(y); // not possible to access y
    }

    public static void main(String[] args){
        outer o =new outer();{
            o.test();
        }
    }
}
