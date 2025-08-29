package DataStructure.Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class deleteMiddle{
    public static void deleteMid(Stack<Integer>st , int pos){
        // create  aarrayalist
         ArrayList<Integer>al = new ArrayList<>();
         // travese of the stack
        while(!st.empty()){
            al.add(st.pop());
        }
        int n = pos / 2;
        // remove element from the arraylist
        al.remove(n);
        for(int i = al.size() -1 ; i >= 0 ; i--){
            st.add(al.get(i));
        }
    }
    public static void main(String[] args) {
        int n ;
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int num ;
            num = sc.nextInt();
            st.push(num);
        }
        System.out.println(st);
        int size = st.size();
        deleteMid(st , size);
        System.out.println(st);
    }
}