package PatternPrinting;

import java.util.Scanner;

class PatternDemo1{
    public static void main(String [] args){
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i <= n ; i++){
            for(int j= 1; j <= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1; i <= n ; i++){
            for(int j= 1; j <= n ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}