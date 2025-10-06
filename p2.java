package corejava.sixoct;

import java.util.Scanner;

class LcmCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int lcm = calculateLcm(number1, number2);

        System.out.println("LCM of " + number1 + " and " + number2 + " is: " + lcm);

        scanner.close();
    }

    public static int calculateLcm(int num1, int num2) {
        int gcd = calculateGcd(num1, num2);
        return (num1 * num2) / gcd;
    }

    public static int calculateGcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
