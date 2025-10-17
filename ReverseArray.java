package corejava.oct17;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        int[] myArray = new int[arraySize];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = scanner.nextInt();
        }

        // Reverse the array
        int start = 0;
        int end = arraySize - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = myArray[start];
            myArray[start] = myArray[end];
            myArray[end] = temp;

            // Move indices towards the middle
            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
