import java.util.Scanner;

public class ArithmeticOperationMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Arithmetic Operation Menu!");
        System.out.println("Please select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        if (choice == 1) {
            result = num1 + num2;
            System.out.println("Result of addition: " + result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println("Result of subtraction: " + result);
        } else if (choice == 3) {
            result = num1 * num2;
            System.out.println("Result of multiplication: " + result);
        } else if (choice == 4) {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero!");
            } else {
                result = num1 / num2;
                System.out.println("Result of division: " + result);
            }
        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }

        scanner.close();
    }
}
