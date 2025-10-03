import java.util.Scanner;

class CheckxXylemorPhloem {
    public static void main(String[] args) {
        // 1. WAJP to check whether the number is xylemorphloem
        //  ex. 32346 = 6 + 3 = 9 and 2 + 3 + 4 = 9 is same then xylem
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num>99) {

            int sum1=0; int sum2 = 0;
            int rem = 0;
            rem = num % 10;
            sum1 = sum1 + rem;
            num = num / 10;

            while(num > 9) {
                rem = num % 10;
                sum2 = sum2 + rem;
                num =  num / 10;
            }
            sum1 = sum1 + num;

            if(sum1 == sum2) {
                System.out.println("Xylem");
            }
            else {
                System.out.println("Phloem");
            }

        }
        else {
            System.out.println("Phleom Number ");
        }

    }
}
