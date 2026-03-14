package Recursion;

import java.util.Scanner;

class Main5{
    public static void fib(int a , int b , int n){
        if(n == 0){
            return ;
        }
        System.out.println(a + " ");
        fib(b , a+ b, n - 1);
    }
    public static void main(String args[]) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
//        int []arr = new int[n];
//        System.out.println("Enter the elements of the array");
//        for(int i = 0 ; i < n ; i++){
//            arr[i] = sc.nextInt();
//        }
//        helper(arr , n);
         fib(0 , 1 , n);
    }
}