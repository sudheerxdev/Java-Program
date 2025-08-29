package DataStructure.Stack;

import java.util.Scanner;
import java.util.Stack;

class RemoveRepeating{
    public static void main(String[] args) {
        int n ;
        System.out.println("enter the size of the arraya ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []arr = new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        // { 1, 2, 2,3,4,4,4,5}
        for(int i = 0 ; i < n ; i++){
            if(st.empty()){
                st.push(arr[i]);
            }
            else{
                if (arr[i]==st.peek()){
                    st.pop();
                }
                else{
                    st.push(arr[i]);
                }
            }
        }
        System.out.println(st);
    }
}