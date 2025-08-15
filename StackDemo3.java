import java.util.Scanner;
import java.util.Stack;

class StackDemo3 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        for(int i = 0 ; i < string.length() ; i++){
            stack.push(string.charAt(i));
        }
        System.out.println(stack);
    }
}