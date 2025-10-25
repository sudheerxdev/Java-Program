package corejava.threeoct;

import java.util.Scanner;

class SumUntilNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (enter a negative number to stop): ");
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
            }

        } while (number >= 0);

        System.out.println("Sum of the numbers entered (excluding the negative number): " + sum);

        scanner.close();
    }
}
