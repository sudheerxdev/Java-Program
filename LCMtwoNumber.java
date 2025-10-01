package corejava;

import java.util.Scanner;

 class LcmOfTwoNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int lcm = 1;
        // Find the greater number between num1 and num2
        int greater = Math.max(num1, num2);

        for (int i = greater; ; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break; // Exit the loop once LCM is found
            }
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        input.close();
    }
}
