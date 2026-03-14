package Recursion;

import java.util.Scanner;

class Main3{
    public static void  helper(int arr[] , int n){
        if(n == 0){
            return ;
        }
//        helper(arr , n - 1);
        System.out.print(arr[n-1] + " ");
        helper(arr , n - 1);
    }
    public static void main(String args[]) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        helper(arr , n);
    }
}