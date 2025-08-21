package Searching_Sorting;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearchDemo12{
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
        target = sc.nextInt();
        int res = BinarySearch(arr , target);
        if(!(res < 0)){
            System.out.println("the element is found at the " + res  + "index");
        }
        else{
            System.out.println("element is not found ");
        }
    }

    private static int BinarySearch(int[] arr, int target) {
        int left = 0 ;
        int right = arr.length -1 ;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}