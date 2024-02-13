package stringPrograms;

import java.util.Scanner;

public class compare {
    void compareTwoString(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("2 strings are equal");
        }
    }
    public static void main(String[] args) {
        compare obj = new compare();
        obj.compareTwoString("abc", "Abc");
    }

}
