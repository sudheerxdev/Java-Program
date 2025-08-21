package Searching_Sorting;

import java.util.Scanner;

class LinearSearchDemo1{
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
        int idx = -1 , count = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]==target){
                count ++;
                if(count == 2){
                    System.out.println("second occurance of the element is  ");
                    flag = true;
                    idx = i;
                    break;
                }
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