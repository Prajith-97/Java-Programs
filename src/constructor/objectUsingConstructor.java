package constructor;

public class objectUsingConstructor {
    int a, b, c;
    objectUsingConstructor(){
        a=5;
        b=6;
    }
    void sum(){
        a=10;
        b=10;
       c=a+b;
    }
    public static void main(String[] args){
        objectUsingConstructor obj = new objectUsingConstructor();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        obj.sum();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}
