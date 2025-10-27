package corejava.oct27;

import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        String capitalizedString = capitalizeEachWord(inputString);
        System.out.println("Capitalized string: " + capitalizedString);

        scanner.close();
    }

    public static String capitalizeEachWord(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize the first letter
                char firstChar = Character.toUpperCase(word.charAt(0));
                String remainingLetters = word.substring(1).toLowerCase(); // Convert remaining to lowercase

                result.append(firstChar).append(remainingLetters).append(" "); //Append word to result
            }
        }

        return result.toString().trim(); //remove trailing space
    }
}
