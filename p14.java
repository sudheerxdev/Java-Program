/* import java.util.Scanner;

class CheckStrongNum {
   public static void main(String[] args) {
       // WAJP to check whether a number is a strong number or not.

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num = sc.nextInt();

       int temp = num;
       int rem;
       int sum = 0;

       while (temp != 0) {
           rem = temp % 10;
           sum += factorial(rem);
           temp = temp / 10;
       }

       if (sum == num) {
           System.out.println(num + " is a Strong number.");
       } else {
           System.out.println(num + " is not a Strong number.");
       }
   }

   public static int factorial(int n) {
       int fact = 1;
       for (int i = 1; i <= n; i++) {
           fact *= i;
       }
       return fact;
   }
}
  */

import java.util.Scanner;

class CheckStrongNum {
    public static void main(String[] args) {
        //  8. WAJP to check whether a number is strong number or not.

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int temp = num;
        int rem = 0;
        int sum = 0;

        while(num != 0) {
            rem = num % 10;
            int fact = 1;

            while(rem>=1) {
                fact *= rem;
                rem--;
            }
            sum+=fact;
            num = num / 10;
        }

        System.out.println("sum = "+sum);

        if(temp == sum) {
            System.out.println(temp + " is a Strong number.");
        }
        else {

            System.out.println(temp + " is not a Strong number.");

        }
    }
}
