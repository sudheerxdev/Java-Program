package corejava.oct27;

import java.util.Scanner;

public class StringContainsOnlyAlphabet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean containsOnlyAlphabet = true;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (!Character.isLetter(ch)) {
                containsOnlyAlphabet = false;
                break;
            }
        }

        if (containsOnlyAlphabet) {
            System.out.println("The string contains only alphabets.");
        } else {
            System.out.println("The string does not contain only alphabets.");
        }

        scanner.close();
    }
}
