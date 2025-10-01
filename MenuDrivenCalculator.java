package corejava;

import java.util.Scanner;

class MenuDrivenCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Cannot divide by zero!");
                            continue; // Go to the next iteration of the loop
                        }
                        break;
                }

                System.out.println("Result: " + result);
            } else if (choice != 5) {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

        } while (choice != 5);

        System.out.println("Exiting Calculator. Dhanyavaad!");
        scanner.close();
    }
}
