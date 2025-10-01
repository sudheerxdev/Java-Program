package corejava;

import java.util.Scanner;
class FindFactors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Factors of " + number + " are: ");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        scanner.close();
    }
}
