package corejava.oct11;

import java.util.Scanner;

public class DecimalToBinaryConverter {

    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder); // Add remainder to the beginning
            decimalNumber = decimalNumber / 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary equivalent: " + binaryNumber);
    }
}
