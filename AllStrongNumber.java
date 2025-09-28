package corejava;

import java.util.Scanner;
class StrongNumbersInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int startRange = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int endRange = scanner.nextInt();

        System.out.println("Strong numbers in the range " + startRange + " to " + endRange + " are:");

        for (int i = startRange; i <= endRange; i++) {
            if (isStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        scanner.close();
    }

    static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
