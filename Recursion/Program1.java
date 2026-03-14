package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static int helper(ArrayList<Integer>al , int n){
        if(n == 0){
            return 0;
        }
        return al.get(n-1) + helper(al , n - 1);
    }
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            al.add(sc.nextInt());
        }
        System.out.println(helper(al , n));
    }
}