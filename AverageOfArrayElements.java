package corejava.oct17;

import java.util.Scanner;

public class AverageOfArrayElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numberOfElements = scanner.nextInt();

        int[] myArray = new int[numberOfElements];
        double sum = 0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numberOfElements; i++) {
            myArray[i] = scanner.nextInt();
            sum += myArray[i];
        }

        double average = sum / numberOfElements;

        System.out.println("The average of the array elements is: " + average);

        scanner.close();
    }
}
