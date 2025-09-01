package DataStructure.Recursion;

import java.util.Scanner;

class Fibbo{
    public static void main(String[] args) {
        int n ;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of eelement in athe arraaya ");
        n = sc.nextInt();
        int a = 0, b = 1;
        int c;
        if(n == 1){
            System.out.println(a);
        }
        if(n >= 2){
            System.out.print(a +  " " + b + " ");
        }
        for(int i = 3; i <= n ; i++){
            c = a+b;
            a = b ;
            b = c;
            System.out.print(c + " ");
        }
    }
}