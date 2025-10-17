package corejava.oct17;

import java.util.Scanner;

public class SumOfArrayElements2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        int[] myArray = new int[numElements];
        int sum = 0;

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < numElements; i++) {
            myArray[i] = scanner.nextInt();
            sum += myArray[i];
        }

        System.out.println("Sum of all elements in the array: " + sum);

        scanner.close();
    }
}
