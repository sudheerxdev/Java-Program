package corejava.oct14;

import java.util.Scanner;

public class RecursiveSum {

    public static int sumOfNaturalNumbers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumOfNaturalNumbers(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        int sum = sumOfNaturalNumbers(number);
        System.out.println("Sum of natural numbers up to " + number + " is: " + sum);

        scanner.close();
    }
}
