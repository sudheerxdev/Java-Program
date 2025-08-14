import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
class Demo5{
    static ArrayList<Integer>CountUnique(int []arr , int n , int k){
        ArrayList<Integer> cu = new ArrayList<>();
        for(int i=0;i<n;i++){
            int length = 0;
            for(int j = i ; j < n ; j++){
                length ++;
                if(length==k){
                    boolean found = false;
                    int num = 0;
                    for(int m = i ; m <= j ; m++){
                        if(arr[m]<0){
                            num = arr[m];
                            found = true;
                            break;
                        }
                    }
                    if(found){
                        cu.add(num);
                    }
                    else{
                        cu.add(0);
                    }
                }
                else{
                    if(length > k){
                        break;
                    }
                }
                if(length > k)break;
            }

        }
        return cu;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k =sc.nextInt();
        ArrayList<Integer> al = CountUnique(arr , n , k);
        for(int num : al){
            System.out.print(num + " ");
        }
    }
}
