package corejava.oct11;

import java.util.Scanner;

public class BinaryToDecimalConverter {

    public static int binaryToDecimal(String binaryString) {
        int decimalValue = 0;
        int power = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimalValue += Math.pow(2, power);
            }
            power++;
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();

        int decimalOutput = binaryToDecimal(binaryInput);
        System.out.println("Decimal equivalent: " + decimalOutput);

        scanner.close();
    }
}
