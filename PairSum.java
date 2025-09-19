class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Node ptr1 = head;

        while (ptr1 != null) {
            Node ptr2 = ptr1.next;  // start from next node to avoid pairing same element
            while (ptr2 != null) {
                if (ptr1.data + ptr2.data == target) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(ptr1.data);
                    pair.add(ptr2.data);
                    result.add(pair);
                }
                ptr2 = ptr2.next;
            }
            ptr1 = ptr1.next;
        }

        return result;
    }
}
