package constructor;

public class baseclass extends chaining{

    baseclass(){
        super();
        System.out.print("---");
    }

    public static void main(String[] args){
        baseclass obj = new baseclass();
        obj.printName();

    }
}
