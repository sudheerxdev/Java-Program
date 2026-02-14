// Java program to Print Diamond Star Pattern
// Using do-while loop

// Importing input output classes
import java.io.*;

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Declaring and initializing variables

        // Variable initialized to the row where max star
        // should be there as after that they decreases to
        // give diamond pattern
        int number = 7;

        // Diamond starting with single star in first row,so
        // initialized
        int m = 1;

        // Columnar printing
        int n;

        // Outer loop 1
        // Prints the first half diamond
        do {
            n = 1;

            // Inner loop 1
            // Prints space until ++n <= number - m + 1 is
            // false
            do {
                // Print whitespace between
                System.out.print(" ");

            }

            // Condition for inside do-while loop 1
            while (++n <= number - m + 1);

            // Now
            n = 1;

            // Inner loop 2
            // Prints star until ++n <= m * 2 - 1 is false

            do {

                // Print star
                System.out.print("*");
            }

            // Condition for inner do-while loop 2
            while (++n <= m * 2 - 1);

            // A new row requires a new line
            System.out.println();

        }

        // Condition for outer do-while loop 1
        while (++m <= number);

        // Now we are done with printing the upper half
        // diamond.

        // Note: Not to print the bottom row again in lower
        // half diamond printing Hence variable to be
        // initialized should one lesser than number
        m = number - 1;

        // Outer loop 2
        // Prints the second half diamond
        do {
            n = 1;

            // Inner loop 1
            // Prints space until ++n <= number - m + 1 is
            // false
            do {
                // Print whitespace between
                System.out.print(" ");

            } while (++n <= number - m + 1);

            n = 1;

            // Inner loop 2
            // Prints star until ++n <= m * 2 - 1 is false
            do {
                // Prints star
                System.out.print("*");

            } while (++n <= m * 2 - 1);

            // By now done with one row of lower diamond
            // printing so a new line is required
            System.out.println();

        }

        // Condition for outer do-while loop 2
        while (--m > 0);
    }
}
