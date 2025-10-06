package corejava.sixoct;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        String str= "aabbccaddd";
        // Output- a2b2c2a1d3
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ;i < str.length();i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else {
                map.put(str.charAt(i), 1);
            }
        }
        map.forEach((key,value)-> System.out.print(key+""+value));


        System.out.println();

        String str1= "2a2b2c1a3d";
        // Output- aabbccaddd

        for(int i = 0;i < str1.length();i++) {
            if(Character.isDigit(str1.charAt(i))) {
                int x = Character.getNumericValue(str1.charAt(i));
                char ch = str1.charAt(i+1);
                for(int j =0; j < x;j++) {
                    System.out.print(ch);
                }
            }
            i++;
        }

        System.out.println();

//   String str3  args="a2b2c2a1d3";
    }
}