import java.util.Scanner;

public class ReverseNumberWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + remainder; // Append the digit to reversedNumber
            number = number / 10; // Remove the last digit from number
        }

        System.out.println("Reversed Number: " + reversedNumber);
        scanner.close();
    }
}
