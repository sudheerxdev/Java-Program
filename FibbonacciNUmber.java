package corejava;

import java.util.Scanner;

class SFibonacciSeriesWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        int i = 1;
        while (i <= n) {
            System.out.print(firstNumber + " ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            i++;
        }
        System.out.println();
        scanner.close();
    }
}
