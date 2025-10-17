package corejava.oct17;

import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);

        scanner.close();
    }
}
