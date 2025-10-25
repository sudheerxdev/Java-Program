package corejava.oct25;

import java.util.Scanner;

public class SearchSortedMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix (row-wise):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        int row = 0;
        int col = cols - 1;
        boolean found = false;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Element found at row: " + (row + 1) + ", column: " + (col + 1));
                found = true;
                break;
            } else if (matrix[row][col] < key) {
                row++;
            } else {
                col--;
            }
        }

        if (!found) {
            System.out.println("Element not found in the matrix.");
        }

        scanner.close();
    }
}
