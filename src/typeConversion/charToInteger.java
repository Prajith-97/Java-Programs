package typeConversion;

public class charToInteger {
    public static void main(String[] args){
        char c = 'A';
        int value = Character.getNumericValue(c);
        System.out.println(value);
    }
}
