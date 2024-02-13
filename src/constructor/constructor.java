package constructor;

public class constructor {

    public constructor(){
        System.out.println("print");
    }
    public constructor(int i){
        System.out.println("constructor"+i);
    }
    void sum() throws Exception {
    try{
        int sum = 3 + 5;
        System.out.println(sum);
    }catch (Exception e){
        throw new Exception(e);
    }

    }
    public static void main(String[] args) throws Exception {
        constructor obj = new constructor(5);
        obj.sum();
    }
}
