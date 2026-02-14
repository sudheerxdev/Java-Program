package corejava.oct11;

import java.util.Scanner;

public class PerfectNumberChecker {

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int sumOfDivisors = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                if (i * i != number) {
                    sumOfDivisors += number / i;
                }
            }
        }

        return sumOfDivisors == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

        scanner.close();
    }
}
