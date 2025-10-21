package corejava.oct21;

import java.util.Scanner;

public class SpiralMatrixTraversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int topRow = 0, bottomRow = rows - 1;
        int leftCol = 0, rightCol = cols - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {

            // Traverse top row
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(matrix[topRow][i] + " ");
            }
            topRow++;

            // Traverse right column
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
            }
            rightCol--;

            // Traverse bottom row
            if (topRow <= bottomRow) { //check before printing to avoid duplicates when it is a single row matrix
                for (int i = rightCol; i >= leftCol; i--) {
                    System.out.print(matrix[bottomRow][i] + " ");
                }
                bottomRow--;
            }


            // Traverse left column
            if (leftCol <= rightCol) { //check before printing to avoid duplicates when it is a single column matrix
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftCol] + " ");
                }
                leftCol++;
            }

        }

        scanner.close();
    }
}
