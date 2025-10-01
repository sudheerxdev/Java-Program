package corejava;

import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        long result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println("The result is: " + result);

        scanner.close();
    }
}
