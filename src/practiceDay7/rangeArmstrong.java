package practiceDay7;

public class rangeArmstrong {
    public static void main(String[] args) {
        int upperLimit = 1000;
        int lowerLimit = 1;

        for (int i = lowerLimit; i <= upperLimit; i++) {
            int num = i;
            int armstrong = 0;
            int numberOfDigits = (int) Math.log10(i) + 1;

            while (num > 0) {
                int digit = num % 10;
                armstrong += Math.pow(digit, numberOfDigits);
                num /= 10;
            }

            if (armstrong == i) {
                System.out.println("Entered number " + i + " is an Armstrong number");
            }
        }
    }
}