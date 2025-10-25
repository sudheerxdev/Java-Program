package corejava.oct25;

import java.util.Scanner;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String stringWithoutSpaces = inputString.replaceAll("\s+", ""); // \s+ matches one or more whitespace characters

        System.out.println("String without whitespaces: " + stringWithoutSpaces);

        scanner.close();
    }
}
