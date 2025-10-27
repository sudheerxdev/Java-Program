package corejava.oct27;

import java.util.Scanner;

public class ReplaceCharacterInString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char charToReplace = scanner.next().charAt(0);

        System.out.print("Enter the replacement character: ");
        char replacementChar = scanner.next().charAt(0);

        String replacedString = inputString.replace(charToReplace, replacementChar);

        System.out.println("Original string: " + inputString);
        System.out.println("Replaced string: " + replacedString);

        scanner.close();
    }
}
