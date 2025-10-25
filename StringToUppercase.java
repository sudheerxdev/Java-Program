package corejava.oct25;

import java.util.Scanner;

public class StringToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String uppercaseString = inputString.toUpperCase();

        System.out.println("Uppercase string: " + uppercaseString);

        scanner.close();
    }
}
