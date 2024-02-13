package Arrays;

public class duplicateElements {
    public static void main(String[] args) {
        char[] ar = {'a', 'b', 'a', 'c', 'd', 'a', 'd'};
        for (int i = 0; i < ar.length; i++) {
            char c = ar[i];
            for (int j = i + 1; j < ar.length; j++) {
                if (c == ar[j]) {
                    System.out.println(c);
                }
            }
        }
    }
}
//to check a particular character is present or not
//        for (char c : charList) {
//            if (c == charToCheck) {
//                isNotPresent = false;
//                break; // Exit the loop if the character is found
//            }
//        }

