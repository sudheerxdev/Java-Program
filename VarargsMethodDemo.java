package corejava.oct14;

import java.util.Scanner;

public class VarargsMethodDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some numbers separated by space: ");
        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");

        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }

        int sum = calculateSum(numbers);
        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }

    // Method using varargs to calculate the sum of numbers
    public static int calculateSum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
