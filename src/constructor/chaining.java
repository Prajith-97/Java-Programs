package constructor;

public class chaining {
   static String name;

   chaining(){
       this("prajith");
   }
    chaining(String name){
       chaining.name = name;
        System.out.println("My name is:");
    }
    void printName(){
        System.out.println(name);
    }
//    public static void main(String[] args){
//        chaining obj = new chaining();
//        obj.printName();
//
//    }
}
