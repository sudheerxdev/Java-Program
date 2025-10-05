import java.util.Scanner;

class HappyOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = 0;
        int rem = 0;

        //  1. WAJP to check Happy Number or not
        // Find Square 49 -> 16 + 81 = 97 = 81 + 49 = 130 = 1 + 9 + 0 = 10 = 1 + 0 = 1 so one is sad number

        while(num > 9) {
            int sum = 0;
            while(num != 0) {
                rem = num % 10;
                square = rem * rem;
                sum = sum + square;
                num = num / 10;
            }
            num = sum;
        }

        if(num == 1) {
            System.out.println("It's a Happy Number");
        }
        else {
            System.out.println("It's a Sad Number");
        }

    }
}
