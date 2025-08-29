package DataStructure.Stack;

import java.util.Scanner;
import java.util.Stack;

class ReverseString{
    public static void main(String[] args) {
        Stack<Character>st = new Stack<>();
        String name ;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        // push all element in the stack
        for(int i = 0 ; i < name.length() ; i++){
            st.push(name.charAt(i));
        }
        // print the stack
        System.out.println(st);
//        System.out.println(st.pop());
        while(!st.empty()){
            System.out.print(st.pop());
        }
    }
}