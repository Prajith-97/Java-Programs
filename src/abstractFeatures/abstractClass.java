package abstractFeatures;

abstract class abstractClass {
    static int a =20;
    static int b = 10;
    void add(){
       int add = a+b;
       System.out.println(add);
    }
    abstract void multiply();

    abstract void divide();
}
