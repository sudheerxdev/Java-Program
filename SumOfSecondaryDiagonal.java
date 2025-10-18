package corejava.oct18;

import java.util.Scanner;

public class SumOfSecondaryDiagonal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (and columns, assuming it's a square matrix): ");
        int numberOfRows = scanner.nextInt();

        int[][] matrix = new int[numberOfRows][numberOfRows];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sumOfSecondaryDiagonal = 0;
        for (int i = 0; i < numberOfRows; i++) {
            sumOfSecondaryDiagonal += matrix[i][numberOfRows - 1 - i];
        }

        System.out.println("Sum of secondary diagonal elements: " + sumOfSecondaryDiagonal);

        scanner.close();
    }
}
