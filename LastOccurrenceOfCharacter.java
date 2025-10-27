package corejava.oct27;

import java.util.Scanner;

public class LastOccurrenceOfCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to find: ");
        char charToFind = scanner.next().charAt(0);

        int lastIndex = -1;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charToFind) {
                lastIndex = i;
            }
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence of '" + charToFind + "' is at index: " + lastIndex);
        } else {
            System.out.println("Character '" + charToFind + "' not found in the string.");
        }

        scanner.close();
    }
}
