package corejava.oct14;

import java.util.Scanner;

public class FindSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numberOfElements = scanner.nextInt();

        int[] myArray = new int[numberOfElements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numberOfElements; i++) {
            myArray[i] = scanner.nextInt();
        }

        int smallestElement = myArray[0];
        for (int i = 1; i < numberOfElements; i++) {
            if (myArray[i] < smallestElement) {
                smallestElement = myArray[i];
            }
        }

        System.out.println("The smallest element in the array is: " + smallestElement);
        scanner.close();
    }
}
