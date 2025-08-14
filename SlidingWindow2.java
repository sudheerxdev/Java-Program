import java.util.Scanner;
class Demo1{
    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]= sc.nextInt();
        }
        int k ;
        System.out.println("enter the size of the window : ");
        k = sc.nextInt();
        int sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            int length = 0 ;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j = i ; j < arr.length ; j++){
                length ++;
                max = Math.max(max , arr[j]);
                min = Math.min(min , arr[j]);
                if(length == k){
                    sum +=(max + min);
                }
            }
        }
        System.out.println(sum);
    }
}