package DataStructure.Sorting;

import java.util.Scanner;

class InsertionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        System.out.println("enter the no. of element  in the array ");
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int j ;
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            j = i -1 ;
            while((j >= 0) && (arr[j] > key)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}