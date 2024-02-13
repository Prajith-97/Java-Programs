package stringPrograms;

import jdk.jfr.StackTrace;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class stringToInteger {
    void stringToInt(){
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
    void stringToDate(){
        String date ="2023-09-20";
        LocalDate d = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        System.out.println(d);
    }

    void stackTraceToString(){
        try{
            String str = "12a";
            int num = Integer.parseInt(str);
            System.out.println(num);
        }catch (Exception e){
//            String str = e.toString();
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exception = sw.toString();
            System.out.println(exception);
        }
    }
    void subString(){
        String txt = "This is Programiz";
        String str1 = "Programiz";
        String str2 = "Programming";

        // check if name is present in txt
        // using contains()
        boolean result = txt.contains(str1);
        System.out.println(str1 + " is present in the string.");

        result = txt.contains(str2);
        if(result) {
            System.out.println(str2 + " is present in the string.");
        }
        else {
            System.out.println(str2 + " is not present in the string.");
        }
    }
    public static void main(String[] args){
        stringToInteger obj = new stringToInteger();
        obj.stringToInt();
        obj.stringToDate();
        obj.stackTraceToString();
    }
}
