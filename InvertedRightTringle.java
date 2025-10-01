package corejava;

import java.util.Scanner;

class InvertedRightTrianglePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();

        for (int i = numberOfRows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
