package DataStructure.Recursion;

import java.util.Scanner;

class Fibboterm {
    static int fibbo(int n){
        int num1 = 0 , num2 = 1;
        int num3;
        int ans = 0;
        if(n == 1){
            ans = num1;
            //return ans;
        }
        else if(n == 2){
            ans = num2 ;
            //return ans;
        }
        else{
            for(int i = 3 ; i <= n ; i++){
                num3 = num1 + num2;
                ans = num3;
                num1 = num2 ;
                num2 = num3;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n ;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of eelement in athe arraaya ");
        n = sc.nextInt();
        int res = fibbo(n);
        System.out.println(Fibboterm.fibbo(1) );
    }
}