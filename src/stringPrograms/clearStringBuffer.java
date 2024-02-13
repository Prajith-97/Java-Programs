package stringPrograms;

public class clearStringBuffer {
    void stringBuffer(){
        StringBuffer sb = new StringBuffer();
        sb.append("abcasdadff");
        System.out.println(sb.toString());
        sb.delete(1,5);
        System.out.println(sb.toString());
    }
    public static void main(String[] args){
        clearStringBuffer sb = new clearStringBuffer();
        sb.stringBuffer();
    }
}
