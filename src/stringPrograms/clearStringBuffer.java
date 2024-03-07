package stringPrograms;

public class clearStringBuffer {
    void stringBuffer(){
        StringBuffer sb = new StringBuffer();
        sb.append("abcasdadff");
        System.out.println(sb.toString());
        sb.delete(1,5);//Deletes characters from index 1 to index 4 (inclusive) from the StringBuffer.
        System.out.println(sb.toString());
    }
    public static void main(String[] args){
        clearStringBuffer sb = new clearStringBuffer();
        sb.stringBuffer();
    }
}
