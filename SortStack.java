import java.util.Scanner;
import java.util.Stack;

class ReverseStack {

    static Stack<Integer> SortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();

            // Move elements from temp back to stack if they are greater than current
            while (!temp.isEmpty() && temp.peek() > current) {
                stack.push(temp.pop());
            }

            temp.push(current);
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        Stack<Integer> res = SortStack(stack);
        System.out.println(res);
    }
}
