package corejava.oct17;

import java.util.Arrays;
import java.util.Scanner;

class mFindMedianOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr); // Sort the array to easily find the median

        double median;
        if (size % 2 == 0) { // If the array size is even
            // Find the middle two elements and take their average
            int mid1 = arr[size / 2 - 1];
            int mid2 = arr[size / 2];
            median = (double) (mid1 + mid2) / 2;
        } else { // If the array size is odd
            // The median is the middle element
            median = arr[size / 2];
        }

        System.out.println("The median of the array is: " + median);

        scanner.close();
    }
}
