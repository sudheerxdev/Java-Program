package corejava;

import java.util.Scanner;

 class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = number; i != 0; i /= 10) {
            int digit = i % 10;
            sum += digit;
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
