package Searching_Sorting;

import java.util.Scanner;

class SelectionSortDemo{
    public static void main(String []args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int idx = i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j + 1;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}