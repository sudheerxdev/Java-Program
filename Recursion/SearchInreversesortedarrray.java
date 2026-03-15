package Binaryserach;

import java.util.Scanner;

class SearchInInverseSortedArray {
    public static int search(int arr[] , int target){
        int low = 0 , high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid]== target){
                return mid;
            }
            // because it is the rotated sorted array
            else if(arr[mid]>target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        // what happen if the target is not found
        return -1;
    }
    public static void main(String[] args){
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
        int res ;
        res = search(arr , target);
        System.out.println("the element is found at index :" + res );
    }
}