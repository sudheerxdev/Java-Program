package DataStructure.Recursion;

import java.util.Scanner;

class Demo{
    static int getNum(int n){
        if(n <= 1){
            return n;
        }
        return (getNum(n - 1) + getNum(n -2));
    }
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.print(getNum(i));
        }
    }
}