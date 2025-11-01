💻 Create a Complex Number Class

import java.util.Scanner;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();

        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);

        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();

        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

        ComplexNumber sum = complex1.add(complex2);

        System.out.println("First Complex Number: " + complex1);
        System.out.println("Second Complex Number: " + complex2);
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}


📤 Output:

Input: 1.0
Input: 2.0
Input: 3.0
Input: 4.0
Output: Enter real part of first complex number: Enter imaginary part of first complex number: Enter real part of second complex number: Enter imaginary part of second complex number: First Complex Number: 1.0 + 2.0i
Second Complex Number: 3.0 + 4.0i
Sum: 4.0 + 6.0i
