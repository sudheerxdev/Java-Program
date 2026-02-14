import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int i = 2;
        while (i <= n) {
            System.out.println(i);
            i += 2;
        }

        scanner.close();
    }
}
