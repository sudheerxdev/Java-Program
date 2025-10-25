package corejava.oct25;

import java.util.Scanner;

public class WaveFormTraversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        int[][] matrix = new int[numRows][numCols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Wave form traversal of the matrix:");

        for (int j = 0; j < numCols; j++) {
            if (j % 2 == 0) {
                // Even column, traverse top to bottom
                for (int i = 0; i < numRows; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Odd column, traverse bottom to top
                for (int i = numRows - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println(); // Add a newline at the end

        scanner.close();
    }
}
