package corejava.oct27;

import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String toggledString = "";

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                toggledString += Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                toggledString += Character.toUpperCase(currentChar);
            } else {
                toggledString += currentChar;
            }
        }

        System.out.println("Toggled case string: " + toggledString);
        scanner.close();
    }
}
