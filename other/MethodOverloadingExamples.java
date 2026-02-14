package corejava.oct14;

import java.util.Scanner;

public class MethodOverloadingExamples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Example of Method Overloading");

        // Creating an object of the class
        MethodOverloadingExamples obj = new MethodOverloadingExamples();

        System.out.println("Sum of 2 integers: " + obj.add(5, 10));
        System.out.println("Sum of 3 integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + obj.add(2.5, 3.5));

        scanner.close();
    }

    // Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to add three integers
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Method to add two doubles
    public double add(double num1, double num2) {
        return num1 + num2;
    }
}
