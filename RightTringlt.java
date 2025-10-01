package corejava;

import java.util.Scanner;

 class RightTrianglePattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= numberOfRows; i++) {
            // Inner loop for columns (printing stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
