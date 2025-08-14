import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
class Demo3{
    static ArrayList<Integer>CountUnique(int []arr , int n , int k){
        ArrayList<Integer> cu = new ArrayList<>();
        for(int i=0;i<n;i++){
            int length = 0;
            HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(arr[j]);
                length ++;
                if(length==k){
                    cu.add(set.size());
                }
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