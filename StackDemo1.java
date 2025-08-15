import java.util.Scanner;
import java.util.Stack;

class StackDemo1{
    public static void main(String[] args){
        Stack stack = new Stack();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            stack.push(sc.nextInt());
        }
        System.out.println(stack);
       Stack st = new Stack();
       while(!stack.isEmpty()){
           st.push(stack.pop());
       }
        System.out.println(st);
    }

}