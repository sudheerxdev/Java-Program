package Recursion;

import java.util.Scanner;

class SumofFirstNNumbers{
    public static int sum(int n){
        // base case
        if(n == 0){
            return 0;
        }
        // recursive case
        return n + sum(n - 1);
    }
    public static void main() {
        int n ;
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int res = sum(n);
        System.out.println(res);
        System.out.println(sum(n));
    }
}