import java.util.ArrayList;
import java.util.HashMap;

class GfG {
    static ArrayList<Integer> intersect(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> seen = new HashMap<>();

        // Traverse through a[] and search every element
        // a[i] in b[]
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                // If found, check if the element is already 
                // in the result to avoid duplicates
                if (a[i] == b[j] && !seen.containsKey(a[i])) {
                    seen.put(a[i], 1);
                    res.add(a[i]);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> res = intersect(a, b);

        for (int x : res)
            System.out.print(x + " ");
    }
}
