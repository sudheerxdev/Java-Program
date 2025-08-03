package COM.SUDHEER.ARRAYLIST;

import java.util.ArrayList;

class Demo2{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.addFirst(12);
        arr.addLast(14);
        arr.add(10);
        arr.add(15);
        arr.add(17);
        arr.add(189);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
    }
}