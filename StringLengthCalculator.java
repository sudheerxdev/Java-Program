package corejava.oct25;

import java.util.Scanner;

public class StringLengthCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int stringLength = inputString.length();

        System.out.println("The length of the string is: " + stringLength);

        scanner.close();
    }
}
