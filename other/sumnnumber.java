import java.util.Scanner;

public class SumOfNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}
