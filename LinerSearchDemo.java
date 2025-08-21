package Searching_Sorting;

import java.util.Scanner;

class LinearSearchDemo{
    public static <bool> void main(String args[]){
        int n , target ;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        target = sc.nextInt();
        int idx = -1;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]==target){
                idx = i;
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println(" element is found at " + idx );
        }
        else{
            System.out.println("element is not found ");
        }
    }
}