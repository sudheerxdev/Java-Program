package corejava.threeoct;

import java.util.Scanner;

class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
        scanner.close();
    }
}
