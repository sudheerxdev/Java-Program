package corejava.sixoct;

import java.util.Scanner;

class ReverseNumberMethod {

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

        int reversedNumber = reverseNumber(originalNumber);

        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }
}
