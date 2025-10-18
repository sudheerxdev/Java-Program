package corejava.oct18;

import java.util.Scanner;

public class SumOfMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (and columns, since it's a square matrix): ");
        int rows = scanner.nextInt();

        int[][] matrix = new int[rows][rows];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][i]; // Add the element at the main diagonal (where row index equals column index)
        }

        System.out.println("Sum of the main diagonal elements: " + sum);

        scanner.close();
    }
}
