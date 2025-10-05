import java.util.Scanner;

class MPowerN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the M : ");
        int m = sc.nextInt();
        System.out.println("Enter the N : ");
        int n = sc.nextInt();
        int product = 1;
        for(int i = 1; i<=n; i++) {
            product = product * m;
        }
        System.out.println(m+" power "+ n + " is " + product);


    }
}
