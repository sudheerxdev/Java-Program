import java.util.Scanner;

class CheckPrimeNumRange {
    public static void main(String[] args) {

        // 4. WAJP to print prime numbers between the range
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower bound:");
        int num1 = sc.nextInt();
        System.out.println("Enter the upper bound:");
        int num2 = sc.nextInt();

        for (int j = num1; j <= num2; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
