import java.util.Scanner;

class checkPrimeNumber
{
    public static void main(String[] args) {

        // 3. WAJP to check whether the number is prime number or not

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        for(int i=2; i<num; i++ ) {

            if(num%i==0) {
                count++;
            }
        }
        if(count==0) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }

    }
}
