package DataStructure.Recursion;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
class PrintElement{
    static void print(int []arr , int n){
       // base case
        if(n < 0){
            return;
        }
       print(arr , n - 1);
        System.out.print(arr[n]);
    }
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element of the arraya ");
        n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter the element of the arraya ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int size = arr.length;
        print(arr , size -1);
    }
}