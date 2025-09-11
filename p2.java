// Java program to find all the
// prime numbers from 1 to N
class gfg {

    // Function to print all the
    // prime numbers till N
    static void prime_N(int N)
    {
        // Declaring the variables
        int x, y, flg;

        // Printing display message
        System.out.println(
            "All the Prime numbers within 1 and " + N
            + " are:");

        // Using for loop for traversing all
        // the numbers from 1 to N
        for (x = 2; x <= N; x++) {

            // Using flag variable to check
            // if x is prime or not
            flg = 1;

            for (y = 2; y * y <= x; y++) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }

            // If flag is 1 then x is prime but
            // if flag is 0 then x is not prime
            if (flg == 1)
                System.out.print(x + " ");
        }
    }

    // The Driver code
    public static void main(String[] args)
    {
        int N = 45;

        prime_N(N);
    }
}
