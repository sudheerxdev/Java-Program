package Searching_Sorting;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearchDemo{
    public static void main(String []args){
        int n ;
        Scanner sc = new Scanner(System.in);

        
        n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int target ;
        boolean found = false;
        target = sc.nextInt();
        int left = 0 , right = n -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid]==target){
                System.out.println("element found at " + mid + " position ");
                found = true;
                break;
            }
            else if(arr[mid]>target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        if(!found){
            System.out.println("element is not found ");
        }
    }

}
