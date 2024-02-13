package samplePrograms;

public class removeSpaces {
    public static void main(String[] args){
        String str="i o p jdjd djdjd nd";
        String newStr = str.replaceAll(" ", "");
        System.out.println(newStr);
    }
}
