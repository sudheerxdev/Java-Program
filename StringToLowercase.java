package corejava.oct25;

import java.util.Scanner;

public class StringToLowercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String lowercaseString = inputString.toLowerCase();

        System.out.println("Lowercase string: " + lowercaseString);

        scanner.close();
    }
}
