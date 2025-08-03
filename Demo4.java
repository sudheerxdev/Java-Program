package COM.SUDHEER.ARRAYLIST;

import java.util.ArrayList;

class Demo4{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr.size());
        arr.addFirst(12);
        arr.addLast(14);
        arr.add(10);
        arr.add(15);
        arr.add(17);
        arr.add(189);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr);
        for(int i = 0 ; i < arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}