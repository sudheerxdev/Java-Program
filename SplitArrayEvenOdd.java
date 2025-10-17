package corejava.oct17;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitArrayEvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] inputArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int number : inputArray) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenNumbers.size(); i++) {
            System.out.print(evenNumbers.get(i) + " ");
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddNumbers.size(); i++) {
            System.out.print(oddNumbers.get(i) + " ");
        }
        System.out.println();

        scanner.close();
    }
}
