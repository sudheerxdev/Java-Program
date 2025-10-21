package corejava.oct21;

import java.util.Scanner;

public class MatrixMultiplicationValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = scanner.nextInt();

        System.out.print("Enter the number of columns for matrix A: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = scanner.nextInt();

        System.out.print("Enter the number of columns for matrix B: ");
        int colsB = scanner.nextInt();

        // Condition for matrix multiplication
        if (colsA == rowsB) {
            System.out.println("Matrix multiplication is possible.");
        } else {
            System.out.println("Matrix multiplication is not possible.");
        }

        scanner.close();
    }
}
