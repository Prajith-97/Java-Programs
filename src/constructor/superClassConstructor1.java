package constructor;

public class superClassConstructor1 extends superClassConstructor{

    superClassConstructor1(){
        System.out.println(a);
        System.out.println(num);
    }

    public static void main(String[] args){
        superClassConstructor1 obj = new superClassConstructor1();
    }
}
