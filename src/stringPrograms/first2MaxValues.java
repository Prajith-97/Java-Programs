package stringPrograms;

public class first2MaxValues {
    public static void main(String[] args){
        int numbers[] = {5,8,3,4,5};
        int fLarge=0;
        int sLarge = 0;
        for(int i=0;i<numbers.length;i++){
            if(fLarge>numbers[i]){
                sLarge=numbers[i];
            }else {
                fLarge=numbers[i];
                sLarge=fLarge;

            }
        }
        System.out.println(fLarge);
        System.out.println(sLarge);
    }
}
