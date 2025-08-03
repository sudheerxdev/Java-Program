package COM.SUDHEER.ARRAYLIST;
import java.util.ArrayList;
class Demo{
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        // adding items in arraylist
        arr.add(10);
        arr.add(12);
        arr.add(14);
        arr.add(16);
        System.out.println(arr);
        arr.add(2,20);
        System.out.println(arr);

    }
}