package stringPrograms;

public class checkNumeric {
    public static void main(String[] args){
        String str="128.12";
        boolean numeric=true;
        try{
            Double d = Double.parseDouble(str);
        }catch (Exception e){
            numeric=false;
        }
        if(!numeric){
            System.out.println("string contains characters");
        }
    }
}
