import java.util.Scanner;

class Selectionsort{
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("please , enter the size of the arraya ");
        n = sc.nextInt();
        // creating he array
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("please , enter the element ");
            arr[i]=sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            int minindex = i ;
            for(int j = i ; j < n ; j++){
                if(arr[j]< arr[minindex]){
                    minindex = j;
                }

            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("sorted arraya " );
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]);
        }
    }
}
