package corejava.oct14;

import java.util.Scanner;

public class MethodWithReturnType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int sum = calculateSum(firstNumber, secondNumber);

        System.out.println("The sum of the two numbers is: " + sum);

        scanner.close();
    }

    // Method to calculate the sum of two integers and return the result
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum; // Returning the calculated sum
    }
}
