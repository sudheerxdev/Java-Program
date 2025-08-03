package COM.SUDHEER.JavaLab;
import java.util.Scanner;
class Student1{
    String name ;
    int age ;
    Student1(int age , String name){
        this.age = age ;
        this.name = name ;
    }
    public void Display(){
        System.out.println("your name is : " + name);
        System.out.println("your age is " + age);
    }

    public static void main(String[] args) {
        int age ;
        String name ;
        Scanner sc = new Scanner(System.in);
        System.out.print("please , enter your age :");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("please , enter your name :");
        name = sc.nextLine();
        Student1 st = new Student1(age , name);
        st.Display();
    }

}