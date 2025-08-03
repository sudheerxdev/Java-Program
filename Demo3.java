package COM.SUDHEER.ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

class Demo3{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.addFirst(12);
        arr.addLast(14);
        arr.add(10);
        arr.add(15);
        arr.add(17);
        arr.add(189);
        System.out.println(arr);
        arr.addLast(190);
        System.out.println(arr);
        // getting the element from arraylist
        System.out.println(arr.get(1));
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        System.out.println(arr.getClass());
        // hanging item in arraaylist
        arr.set(0,23);
        arr.set(arr.indexOf(10),34);
        System.out.println(arr);
    }
}