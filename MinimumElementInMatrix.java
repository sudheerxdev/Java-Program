package corejava.oct21;

import java.util.Scanner;

public class MinimumElementInMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int minElement = matrix[0][0]; // Assume first element is minimum initially

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
        }

        System.out.println("Minimum element in the matrix: " + minElement);

        scanner.close();
    }
}
