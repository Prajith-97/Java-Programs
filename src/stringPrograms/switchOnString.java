package stringPrograms;

public class switchOnString {

    private final int num =10;
    private void sample(){

    }

    void switchCase(String str){
        switch (str){
            case "monday":
                System.out.println("day is monday");
                System.out.println(num);
                sample();
                break;
        }
    }
    public static void main(String[] args){
        switchOnString obj = new switchOnString();
        obj.switchCase("monday");
    }
}
