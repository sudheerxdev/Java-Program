package corejava.threeoct;

import java.util.*;

class NumberSpyOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        // num = 123 = 6
        // 1 * 2 * 3 = 6
        //  if both result is same then we can say this is the Spy number.

        int sum = 0;
        int mul = 1;

        while(num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            mul = mul * rem;
            num = num / 10;
        }

        System.out.println(sum);
        System.out.println(mul);

        if(mul == sum) {
            System.out.println("The given number is spy number ");
        }
        else {
            System.out.println("The given number is not a spy number ");
        }



    }
}
