import java.util.Scanner;

class InsertionSortDemo{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1 ; i < n ; i++){
            int j = i -1 ;
            int item = arr[i];
            while(j >= 0 && arr[j]>item){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=item;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}