package corejava;

import java.util.Random;
import java.util.Scanner;

 class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int guess;
        int numberOfTries = 0;

        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();
            numberOfTries++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
            }
        } while (guess != randomNumber);

        sc.close();
    }
}
