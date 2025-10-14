package corejava.oct14;

import java.util.Scanner;

public class LargestElementInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numberOfElements = scanner.nextInt();

        int[] myArray = new int[numberOfElements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numberOfElements; i++) {
            myArray[i] = scanner.nextInt();
        }

        int largestElement = myArray[0];
        for (int i = 1; i < numberOfElements; i++) {
            if (myArray[i] > largestElement) {
                largestElement = myArray[i];
            }
        }

        System.out.println("The largest element in the array is: " + largestElement);

        scanner.close();
    }
}
