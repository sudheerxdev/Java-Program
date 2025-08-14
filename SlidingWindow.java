import java.util.Scanner;
class Demo{
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
        int lsum = 0 , rsum = 0;
        int max = 0 ;

        // take all element from left
        for(int i = 0 ; i < k ; i++){
            lsum += arr[i];
        }
        max = Math.max(lsum + rsum , max);
        int size = arr.length - 1;
        for(int i = k - 1 ; i >= 0; i--){
            lsum = lsum - arr[i];
            rsum = rsum + arr[size];
            size --;
            max = Math.max(lsum + rsum, max);
        }
        System.out.println("max = " + max);
    }
}