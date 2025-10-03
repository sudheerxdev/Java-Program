package corejava.threeoct;

import java.util.Scanner;

class PasswordValidationDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isValid;

        do {
            System.out.print("Enter your password (at least 8 characters): ");
            password = scanner.nextLine();

            isValid = password.length() >= 8;

            if (!isValid) {
                System.out.println("Password is too short. Please try again.");
            }
        } while (!isValid);

        System.out.println("Password accepted!");

        scanner.close();
    }
}
