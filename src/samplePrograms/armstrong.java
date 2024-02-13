package samplePrograms;

public class armstrong {
    public static void main(String[] args){
        int num = 10;
        double armstrong = 0;
        int len =  (int) (Math.log10(num) + 1);
        for(int i= 0;i<len;i++){
            int remainder = num%10;
            armstrong = armstrong+Math.pow(remainder,len);
            num = num/10;
        }
        if (num == armstrong){
            System.out.println("Entered number is an armstrong" +armstrong);
        }else {
            System.out.println("Entered number is not an armstrong");
        }
    }

}
