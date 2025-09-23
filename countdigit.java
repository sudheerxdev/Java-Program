import java.util.Scanner;

public class CountDigitsInNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;
        int originalNumber = number; // Store the original number

        if (number == 0) {
            count = 1; // Special case for 0
        } else {
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("The number of digits in " + originalNumber + " is: " + count);

        input.close();
    }
}
