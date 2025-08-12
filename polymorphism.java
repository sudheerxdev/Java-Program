import java.util.Scanner;
class Addition{
  int add(int a , int b ){
    System.out.println(a + b );
  }
}
class NewAddition extends Addition{
  int add(int a ){
    System.out.println(a + 10);
  }
}
class Demo{
  public static void main(String args[]){
    int num1 , num2;
    Scanner sc = new Scanner(System.in);
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    Addition ad = new Addition();
    ad.add(num1 , num2);
    NewAddition ad1 = new NewAddition();
    ad1.add(num1);
  }
}
