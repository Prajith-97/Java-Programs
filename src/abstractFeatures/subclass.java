package abstractFeatures;

public class subclass extends abstractClass{

    @Override
    void multiply() {
        int multiply = a*b;
        System.out.println(multiply);
    }

    @Override
    void divide() {
        int divide = a/b;
        System.out.println(divide);
        super.add(); // super keyword can be used to call the method in the parent class
    }
    void add(){   //inheritance supports method overriding
        int add = a+a+b+b;
        System.out.println(add);
    }
    public static void main(String[] args){

        subclass obj = new subclass();
        obj.add();
        obj.divide();
        obj.multiply();
    }
}
