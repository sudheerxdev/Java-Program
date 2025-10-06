package corejava.sixoct;

import java.util.Scanner;

class GCDCalculator {

    public static int calculateGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int gcd = calculateGCD(firstNumber, secondNumber);
        System.out.println("GCD of " + firstNumber + " and " + secondNumber + " is: " + gcd);

        scanner.close();
    }
}
