class Solution {
    // Helper function
    boolean isBSTUtil(Node root, long min, long max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max) return false;

        return isBSTUtil(root.left, min, root.data) &&
               isBSTUtil(root.right, root.data, max);
    }

    // Main function
    boolean isBST(Node root) {
        return isBSTUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
