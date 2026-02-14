import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            int lastDigit = tempNumber % 10;
            sum += lastDigit;
            tempNumber /= 10; // integer division
        }

        System.out.println("Sum of digits of " + number + " is: " + sum);

        scanner.close();
    }
}
