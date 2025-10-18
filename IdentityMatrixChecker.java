package corejava.oct18;

import java.util.Scanner;

public class IdentityMatrixChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (and columns) for the square matrix: ");
        int rows = scanner.nextInt();

        int[][] matrix = new int[rows][rows];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isIdentity = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == j) {
                    if (matrix[i][j] != 1) {
                        isIdentity = false;
                        break;
                    }
                } else {
                    if (matrix[i][j] != 0) {
                        isIdentity = false;
                        break;
                    }
                }
            }
            if (!isIdentity) {
                break;
            }
        }

        if (isIdentity) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }

        scanner.close();
    }
}
