package corejava.threeoct;

import java.util.Scanner;

class ContinueUntilUserSaysNo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Doing some work...");
            System.out.print("Do you want to continue? (Yes/No): ");
            userInput = scanner.nextLine();
        } while (!userInput.equalsIgnoreCase("No"));

        System.out.println("Program terminated.");
        scanner.close();
    }
}
