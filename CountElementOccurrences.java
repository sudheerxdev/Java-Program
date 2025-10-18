package corejava.oct18;

import java.util.Scanner;

public class CountElementOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to count: ");
        int elementToCount = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (myArray[i] == elementToCount) {
                count++;
            }
        }

        System.out.println("The element " + elementToCount + " appears " + count + " times in the array.");

        scanner.close();
    }
}
