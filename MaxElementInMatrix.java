package corejava.oct21;

import java.util.Scanner;

public class MaxElementInMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxElement = matrix[0][0]; // Initialize maxElement with the first element

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }

        System.out.println("Maximum element in the matrix: " + maxElement);

        scanner.close();
    }
}
