package numberPrograms;

public class LargestThanN {
    public static void main(String[] args){
        int givenNum = 435;
        int n = 3;
        char c = Integer.toString(n).charAt(0);
        for(int i =givenNum;i>0;--i){
            if(Character.toString(i).indexOf(c)==-1){
                System.out.println(i);
                break;
            }
        }
        System.out.println(givenNum);
    }
}
