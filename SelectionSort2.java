package Searching_Sorting;

import java.util.Scanner;

import static java.util.Collections.swap;

class SelectionSortDemo1{
    private static int selection(int []arr , int start , int n){
        int idx = start;
        for(int i = start + 1 ; i < n  ; i++){
           if(arr[idx] > arr[i]){
               idx = i ;
           }
        }
        return idx;
    }
    public static void main(String []args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n - 1 ; i++){
            int pos = selection(arr , i , n);
           // swap(arr[i] , arr[pos]);
            int temp = arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

//    private static void swap(int i, int i1) {
//        int temp = i;
//        i = i1 ;
//        i1 = temp;
//    }
}