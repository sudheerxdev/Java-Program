import java.util.Scanner;

class checkAmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3. WAJP to check whether the number is amstrong number or not
        //  153 = 1 , 5, 3 qube = 1 + 125 + 27 = 153 then its amstrong

        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        int sum = 0;

        while(temp != 0) {
            temp = temp / 10;
            count++;
        }
        int temp2 = num;
        int rem=0;
        while(temp2!=0) {
            rem = temp2 % 10;
            int product = 1;
            for(int i = 1; i<= count; i++) {
                product = product * rem;
            }
            sum = sum + product;
            temp2 = temp2 / 10;
        }

        if(sum == num ) {
            System.out.println("Its Amstrong number");
        }
        else {
            System.out.println("Not a Amstrong number");
        }

    }
}
