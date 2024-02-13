package practiceDay4;

public class vowlesConsonants {
    public static void main(String[] args){
        String str = "eeeeeE  nju";
        int len = str.length();
        int vowles = 0;
        int consonants = 0;
        int whitespace = 0;
        System.out.println(len);
        for(int i = 0; i<len;i++){
            if(str.charAt(i)=='A'||str.charAt(i)=='a'){
                vowles++;
            } else if (str.charAt(i)=='E'||str.charAt(i)=='e') {
                vowles++;
            } else if (str.charAt(i)=='I'||str.charAt(i)=='i'){
                vowles++;
            }else if (str.charAt(i)=='O'||str.charAt(i)=='o'){
                vowles++;
            }else if (str.charAt(i)=='U'||str.charAt(i)=='u'){
                vowles++;
            }else if (str.charAt(i)==' '){
                whitespace++;
            }
            else {
                consonants++;
            }
        }
        System.out.println(vowles);
        System.out.println(consonants);
    }
}
