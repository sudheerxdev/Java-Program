import java.util.Scanner;

class StackDemo {
    int top;
    int[] arr;

    // passing the size of the array stack
    StackDemo(int n) {
        arr = new int[n];
        top = -1; // initialize as empty stack
    }

    void push(int data) {
        if (top == arr.length - 1) { // stack overflow condition
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
        System.out.println("Data " + data + " is added in the stack");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + arr[top--]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        int n = sc.nextInt();

        StackDemo obj = new StackDemo(n);

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6); // will overflow

        obj.display();

        obj.pop();
        obj.pop();
        obj.display();
    }
}
