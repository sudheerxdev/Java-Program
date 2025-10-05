package corejava.threeoct;

import java.util.Scanner;

class ArmstrongNumberChecker {

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = 0;
        int sum = 0;
        int tempNumber = number;

        // Count the number of digits
        while (tempNumber != 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }

        // Calculate the sum of digits raised to the power of numberOfDigits
        tempNumber = number;
        while (tempNumber != 0) {
            int remainder = tempNumber % 10;
            sum += Math.pow(remainder, numberOfDigits);
            tempNumber /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
