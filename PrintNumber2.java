package DataStructure.Recursion;

import java.util.Scanner;

class PrintNumber1{
    static void PrintNumber(int n){
        if(n == 0){
            return;
        }
        PrintNumber(n -1);
        System.out.print(n + " ");

    }
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("enter the number ");
        PrintNumber(n);
    }
}