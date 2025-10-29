💻 Create a Simple Class (Person with name, age)

import java.util.Scanner;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        Person person = new Person(name, age);
        person.displayDetails();

        scanner.close();
    }
}


📤 Output:

Input: John Doe
Input: 30
Output: Enter the name: Enter the age: Name: John Doe
Output: Age: 30
