package Binaryserach;

import java.util.ArrayList;
import java.util.Scanner;

class FindFirstandLastOccurance{
    public static int searchFirstOccurance(int arr[] , int target){
        int start = 0 , end = arr.length - 1;
        int res = -1 ;
        while(start <= end){
            int mid = start + (end - start ) /2;
            if(arr[mid]==target){
                res = mid;
                end = mid - 1;
            }
            else if(arr[mid]>target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return res ;

    }
    public static int searchLastOccurance(int arr[] , int target){
        int start = 0 , end = arr.length - 1;
        int res = -1 ;
        while(start <= end){
            int mid = start + (end - start ) /2;
            if(arr[mid]==target){
                res = mid;
                start = mid + 1;
            }
            else if(arr[mid]>target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return res ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        // initialised the array
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int target ;
        System.out.println("Enter the element to be searched");
        target = sc.nextInt();
        int res1;
        res1 = searchFirstOccurance(arr , target);
        System.out.println("the element is found at index :" + res1 );
        int res2 = searchLastOccurance(arr , target);
        System.out.println("the element is found at index :" + res2 );
    }
}