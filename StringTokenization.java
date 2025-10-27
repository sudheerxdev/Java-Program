package corejava.oct27;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to tokenize: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter the delimiter (e.g., comma, space): ");
        String delimiter = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(inputString, delimiter);

        System.out.println("Tokens are:");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

        scanner.close();
    }
}
