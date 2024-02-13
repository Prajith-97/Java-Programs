package practiceDay5;

public class reverseString {
    public static void main(String[] args) {
        String str = "abcd efgh higk";
        StringBuilder newStr= new StringBuilder();
        int length = str.length();
        System.out.println(length);
        for (int i = length-1; i >= 0; --i) {
            newStr.append(str.charAt(i));
        }
        System.out.println(newStr.toString());
    }
}