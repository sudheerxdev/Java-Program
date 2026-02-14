💻 String Builder Operations

import java.util.Scanner;

public class StringBuilderOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(inputString);

        System.out.println("Original string: " + stringBuilder);

        System.out.println("Enter text to append:");
        String textToAppend = scanner.nextLine();
        stringBuilder.append(textToAppend);
        System.out.println("After appending: " + stringBuilder);

        System.out.println("Enter the index to insert at:");
        int insertIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter text to insert:");
        String textToInsert = scanner.nextLine();
        stringBuilder.insert(insertIndex, textToInsert);
        System.out.println("After inserting: " + stringBuilder);

        System.out.println("Enter start index to delete from:");
        int startIndex = scanner.nextInt();
        System.out.println("Enter end index to delete to (exclusive):");
        int endIndex = scanner.nextInt();
        stringBuilder.delete(startIndex, endIndex);
        System.out.println("After deleting: " + stringBuilder);

        System.out.println("Reversed string: " + stringBuilder.reverse());

        scanner.close();
    }
}


📤 Output:

Enter a string:
Input: Hello
Output: Original string: Hello
Enter text to append:
Input: World
Output: After appending: HelloWorld
Enter the index to insert at:
Input: 5
Output: Enter text to insert:
Input: there
Output: After inserting: HellothereWorld
Enter start index to delete from:
Input: 5
Output: Enter end index to delete to (exclusive):
Input: 10
Output: After deleting: HelloWorld
Output: Reversed string: dlroWolleH
