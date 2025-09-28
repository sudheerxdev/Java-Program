package corejava;

import java.util.Scanner;

 class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter the limit till where you want the table: ");
        int limit = scanner.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
