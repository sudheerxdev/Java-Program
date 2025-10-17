package corejava.oct17;

import java.util.Scanner;

public class CumulativeSumArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        int[] inputArray = new int[arraySize];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int[] cumulativeSumArray = new int[arraySize];
        cumulativeSumArray[0] = inputArray[0];

        for (int i = 1; i < arraySize; i++) {
            cumulativeSumArray[i] = cumulativeSumArray[i - 1] + inputArray[i];
        }

        System.out.println("Cumulative sum of the array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(cumulativeSumArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
