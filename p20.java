import java.util.Scanner;

class checkPerfectNum {
    public static void main(String[] args) {

        // 2. WAJP to print the perfect  number between the range

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        for(int j= num1; j<=num2; j++) {

            int sum=0;
            int num = j;
            for(int i=1; i<num; i++) {
                if(num % i == 0) {
                    sum = sum + i;
                }
            }

            if(sum==num) {
                System.out.println("Perfect Number: "+j);
            }
        }


    }
}
