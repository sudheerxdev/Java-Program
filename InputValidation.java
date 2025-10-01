package corejava;

import java.util.Scanner;

 class RangeInputValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int lowerBound = 10;
        int upperBound = 50;

        do {
            System.out.print("Enter a number between " + lowerBound + " and " + upperBound + ": ");
            number = scanner.nextInt();

            if (number < lowerBound || number > upperBound) {
                System.out.println("Invalid input. Please enter a number within the specified range.");
            }
        } while (number < lowerBound || number > upperBound);

        System.out.println("You entered: " + number);
        scanner.close();
    }
}
