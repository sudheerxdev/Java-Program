package COM.SUDHEER.ARRAYLIST;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;

class ArrayList1{
    public static void main(String[] args) {
        int []arr = new int[10];
        Arrays.setAll(arr , i -> i);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr , 1);
        
        System.out.println(Arrays.toString(arr));
        
        Arrays.fill(arr , 1, 5, 4);
        System.out.println(Arrays.toString(arr));
        int []arr1 = new int[]{1,2,3,4,5};
        int[] arr5 ={1,2,3,4};

    }
}

