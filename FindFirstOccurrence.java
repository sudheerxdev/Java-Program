package corejava.oct25;

import java.util.Scanner;

public class FindFirstOccurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to find: ");
        char charToFind = scanner.next().charAt(0);

        int firstOccurrenceIndex = -1; // Initialize with -1 in case the character is not found

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charToFind) {
                firstOccurrenceIndex = i;
                break; // Exit the loop after finding the first occurrence
            }
        }

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of '" + charToFind + "' is at index: " + firstOccurrenceIndex);
        } else {
            System.out.println("Character '" + charToFind + "' not found in the string.");
        }

        scanner.close();
    }
}
