package corejava.oct17;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        int[] numbers = new int[arraySize];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        if (arraySize < 2) {
            System.out.println("Array must have at least two elements.");
        } else {
            Arrays.sort(numbers); // Sort the array

            System.out.println("Second smallest element: " + numbers[1]);
        }

        scanner.close();
    }
}
