package DataStructure.Recursion;

import java.util.Scanner;

class PrintNumber{
    static void PrintNumber(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        PrintNumber(n -1);
    }
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("enter the number ");
        PrintNumber(n);
    }
}