import java.util.Scanner;

public class CountEvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numberOfElements = scanner.nextInt();

        int[] myArray = new int[numberOfElements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numberOfElements; i++) {
            myArray[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int num : myArray) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        scanner.close();
    }
}
