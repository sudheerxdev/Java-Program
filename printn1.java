import java.util.Scanner;

public class PrintNumbersNto1While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int i = number;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        scanner.close();
    }
}
