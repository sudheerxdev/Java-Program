package corejava.oct25;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversedString = new StringBuilder(inputString).reverse().toString();

        System.out.println("Reversed string: " + reversedString);
        scanner.close();
    }
}
