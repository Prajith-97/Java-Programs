package constructor;

public class stringConstructor1 extends stringConstructor {
    stringConstructor1(){
        b = "initialize string b";
        System.out.println("child class");
    }
    public static void main(String[] args){
        stringConstructor1 obj = new stringConstructor1();
        System.out.println(obj.b);
        System.out.println(obj.a);
    }
}
