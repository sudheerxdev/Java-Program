package corejava.threeoct;

import java.util.Scanner;

class CheckSmallestNumber {
    public static void main(String[] args) {

        //  7. WAJP to print he smallest digit of a number

        Scanner sc= new Scanner(System.in);

        int num =sc.nextInt();

        // int digit = Integer.MAX_VALUE;
        int digit = 9;


        while(num > 0) {

            int rem = num % 10;

            if(digit>rem) {

                digit = rem;

            }
            num = num / 10;

        }

        System.out.println(digit);


    }
}
