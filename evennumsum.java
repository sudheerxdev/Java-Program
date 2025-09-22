import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 2;

        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
        scanner.close();
    }
}
