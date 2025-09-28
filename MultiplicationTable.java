package corejava;

import java.util.Scanner;
class MultiplicationTableWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter the limit for the multiplication table: ");
        int limit = scanner.nextInt();

        int i = 1;
        while (i <= limit) {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }

        scanner.close();
    }
}
