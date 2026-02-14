class Solution {
    public static int findMax(Node root) {
        // code here
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int lleft = findMax(root.left);
        int rright = findMax(root.right);
        return Math.max(root.data , Math.max(lleft , rright) );
    }

    public static int findMin(Node root) {
        
        // code here
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int lleft = findMin(root.left);
        int rright = findMin(root.right);
        return Math.min(root.data , Math.min(lleft , rright) );
    }
}
