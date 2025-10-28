💻 String Tokenization

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to tokenize: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter the delimiter (e.g., comma, space): ");
        String delimiter = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(inputString, delimiter);

        System.out.println("Tokens are:");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

        scanner.close();
    }
}


📤 Output:

Input: This is, a sample string.
Input: ,
Output: Enter a string to tokenize:
Enter the delimiter (e.g., comma, space):
Tokens are:
This is
 a sample string.
Input: Hello World!
Input:
Output: Enter a string to tokenize:
Enter the delimiter (e.g., comma, space):
Tokens are:
H
e
l
l
o

W
o
r
l
d
!
Input: apple banana orange
Input:
Output: Enter a string to tokenize:
Enter the delimiter (e.g., comma, space):
Tokens are:
apple
banana
orange
Input: one two three four
Input:
Output: Enter a string to tokenize:
Enter the delimiter (e.g., comma, space):
Tokens are:
one two three four
Input: a,b,c,d,e
Input: ,
Output: Enter a string to tokenize:
Enter the delimiter (e.g., comma, space):
Tokens are:
a
b
c
d
e
Input:  123 456 789
Input:
Output: Enter a string to tokenize:
Enter the delimiter (e.g., comma, space):
Tokens are:
123 456 789
Input: test-string
Input: -
Output: Enter a string to tokenize:
Enter the delimiter (e.g., comma, space):
Tokens are:
test
string
Input: example string
Input: x
Output: Enter a string to tokenize:
Enter the delimiter (e.g., comma, space):
Tokens are:
e
ample string
