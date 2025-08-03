package COM.SUDHEER.ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

class SortArraylist{
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(12);
        arr.add(40);
        arr.add(16);
        arr.add(34);
        arr.add(20);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}