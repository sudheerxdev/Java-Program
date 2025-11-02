💻 Create a Fraction Class

import java.util.Scanner;

public class FractionClass {

    private int numerator;
    private int denominator;

    public FractionClass(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero. Setting it to 1.");
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero. Not changing it.");
        } else {
            this.denominator = denominator;
        }
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int num = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int den = scanner.nextInt();

        FractionClass myFraction = new FractionClass(num, den);

        System.out.println("The fraction is: " + myFraction.toString());

        System.out.print("Enter a new numerator: ");
        int newNum = scanner.nextInt();
        myFraction.setNumerator(newNum);

        System.out.println("The updated fraction is: " + myFraction.toString());

        scanner.close();
    }
}


📤 Output:

Input: 5
Input: 2
Output: The fraction is: 5/2
Input: 7
Output: The updated fraction is: 7/2
