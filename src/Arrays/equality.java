package Arrays;

public class equality {
    public static void main(String[] args){
        String[] ar = new String[10];
        String[] a = new String[10];
        String[] a1 = {"tim", "smith", "jacob"};
        String[] a2 ={"tim", "smith","jacob"};
        boolean equals=true;
        if(a1.length==a2.length){
            for(int i=0;i<a1.length;i++){
                if(a1[i]!=a2[i]){
                    equals=false;
                    break;
                }
            }
        }else {
            equals=false;
        }
        if(equals==false){
            System.out.println("Not Equal");
        }else {
            System.out.println("Arrays are Equal");
        }
    }
}
