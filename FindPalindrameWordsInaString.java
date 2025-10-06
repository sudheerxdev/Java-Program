package corejava.sixoct;

public class FindPalindrameWordsInaString {

    public static boolean isPalindrome(String input) {
        int i1 = 0;
        int i2 = input.length() - 1;

        if (input.charAt(i1) != input.charAt(i2)) {
            return false;
        }
        i1++;
        i2--;
        return true;
    }

    public static boolean isPalindrome1(String input) {
        String reverseString = new StringBuilder(input).reverse().toString();
        if(reverseString.equals(input)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {

        String str = "My name is nitin and i am speak malayalam";
        String[] split = str.split(" ");

        for(String words : split) {
            if(isPalindrome(words)) {
                System.out.println("Hi : "+words);
            }
        }

        for(String words : split) {
            if(isPalindrome1(words)) {
                System.out.println("Hello : "+ words);
            }
        }

// for(int i = 0;i < split.length;i++) {
//  String string = new StringBuilder(split[i]).reverse().toString();
//  String[] split2 = string.split(" ");
//  for (int j = i; j < split2.length; j++) {
//   if(split2[j].equals(split[i])) {
//    System.out.println("Palindrame : "+split2[j]);
//   }
//  }
// }
    }
}