package COM.SUDHEER.ARRAYLIST;

import java.util.Scanner;

class Recursion{
    static void func(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        func(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("enter the nujmber to print in reverse order : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        func(num);
    }
}