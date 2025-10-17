package corejava.oct17;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        int[] inputArray = new int[arraySize];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int[] uniqueArray = removeDuplicates(inputArray);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static int[] removeDuplicates(int[] inputArray) {
        Arrays.sort(inputArray); // Sort the array to easily find duplicates

        if (inputArray.length == 0) {
            return inputArray;
        }

        int j = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] != inputArray[i + 1]) {
                inputArray[j++] = inputArray[i];
            }
        }
        inputArray[j++] = inputArray[inputArray.length - 1]; // Add the last element

        int[] uniqueArray = new int[j];
        System.arraycopy(inputArray, 0, uniqueArray, 0, j); // Copy unique elements to a new array

        return uniqueArray;
    }
}
