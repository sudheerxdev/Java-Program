package PatternPrinting;
import java.util.Scanner;
class PatternDemo3{
    public static void main(String [] args){
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i <= n ; i++){
            for(int j= 1; j <= n ; j++){
                if(i==j || i + j == n +1 || i == 1 || j == 1 || i == n || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}