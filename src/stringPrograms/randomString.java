package stringPrograms;

import java.util.Random;

public class randomString {
    void random(){
        int len=7;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();//create random class object
        for(int i=0;i<len;i++){
            int index = random.nextInt(alphabet.length());//generate random number
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args){
        randomString obj = new randomString();
        obj.random();
    }
}
