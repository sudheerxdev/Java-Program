package corejava.oct17;

import java.util.Scanner;

public class ProductOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        int[] myArray = new int[arraySize];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = scanner.nextInt();
        }

        long product = 1; // Using long to avoid potential integer overflow

        for (int i = 0; i < arraySize; i++) {
            product *= myArray[i];
        }

        System.out.println("Product of all elements in the array: " + product);

        scanner.close();
    }
}
