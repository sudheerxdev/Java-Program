package DataStructure.Stack;
import java.util.*;
import java.util.ArrayList;

class ParaChecker{
    public static boolean isValid(String str){
//        if (str.charAt(0)==']' ||str.charAt(0)=='}' || str.charAt(0)==')'  ) {
//            return false;
//        }
        Stack<Character>st = new Stack<>();
        for(char ch : str.toCharArray()){
            // check if the starting is opening bracjet
            if(ch == '(' || ch == '{' || ch == '['){
                // if it is the opening bracket then push in the stack
                st.push(ch);
            }
            // if it is the closing brackety
            else{
                // if stack is empty
                if(st.isEmpty()) return false;
                // if the stack is not empty
                else if((ch == ')' && st.peek() != '(') || (ch == '}' && st.peek() != '{') || (ch == ']' && st.peek() != '[')){
                    return false;
                }
                st.pop();
            }
//            st.pop();
        }
        if(!st.empty()) return false;
        return true;
    }
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element  ");
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.println("enter the " + (i +1) + " element ");
            String str ;
            str = sc.next();
            al.add(str);
        }
        System.out.println(al);
        // check each and every element in the arrayalist
        for(int i = 0 ; i < n ; i++){
            System.out.println(isValid(al.get(i)));
        }
    }
}