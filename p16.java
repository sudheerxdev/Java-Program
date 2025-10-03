import java.util.Scanner;

class checkBuzzNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 6. WAJP to check the number is buzz number or not.

        System.out.println("Enter one number: ");
        int num1 = sc.nextInt();


        int rem = num1 % 10;
        if(num1 % 10 == 7 || num1 % 7 == 0) {
            System.out.println("its a buzz ");
        }
        else {
            System.out.println("Its not buzz");
        }
    }

}
}
