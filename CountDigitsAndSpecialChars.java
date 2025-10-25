package corejava.oct25;

import java.util.Scanner;

public class CountDigitsAndSpecialChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int digitCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of special characters: " + specialCharCount);

        scanner.close();
    }
}
