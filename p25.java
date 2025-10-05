import java.util.Scanner;

class checkNeonOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2. WAJP to check whether the number is neon number or not
        //  Square = 9 = 81 = 8+1 = 9 is calles neon number

        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;

        while(square != 0) {
            sum = sum + square%10;
            square = square / 10;
        }

        if(sum == num ) {
            System.out.println("Neon Number");
        }
        else {
            System.out.println("Not a Neon Number");
        }
    }
}
