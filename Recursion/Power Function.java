package Recursion;

import java.util.Scanner;

class PowerFunction{
    public static int pow(int n , int p){
        if(p == 0){
            return 1;
        }
        return n * pow(n , p - 1);
    }
    public static void main(String[] args) {
        int n  , p;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = sc.nextInt();
        int res = pow(n , p);
        System.out.println(res);
    }
}