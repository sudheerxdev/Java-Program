package corejava.sixoct;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test4 {

    public static boolean find(String originalString, String searchString) {

        String[] word = originalString.split("\\s+");
        for(int i =0;i < word.length ; i++) {
            if(word[i].equals(searchString)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String originalString = "my name is rohit kumar";
        String searchString = "is";
        System.out.println(find(originalString, searchString));

//            String[] split = searchString.split("");
//  boolean match = Arrays.stream(originalString.split(" ")).allMatch(split::contains);
//  System.out.println(match ? "true" : "false");
    }
}