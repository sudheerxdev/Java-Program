package corejava;

import java.util.Scanner;

 class PyramidPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int numberOfRows = scanner.nextInt();

        for (int i = 1; i <= numberOfRows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= numberOfRows - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
