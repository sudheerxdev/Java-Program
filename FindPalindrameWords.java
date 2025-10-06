package corejava.sixoct;

import java.util.stream.IntStream;

public class FindPalindrameWords {

    public static void main(String[] args) {

        String str = "csloc";
//  String reverseString = new StringBuilder(str).reverse().toString();
//  if(reverseString.equals(str)) {
//   System.out.println("Palindrame word");
//  }
//  else {
//   System.out.println("Not Palindrame word");
//  }

        boolean allMatch = IntStream.range(0, str.length()/2).allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
        System.out.println(allMatch ? "Palindrame word " : "Not Palindrame word");
    }
}