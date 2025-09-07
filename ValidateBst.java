class Solution {
    public boolean isValidBST(TreeNode root) {
        return ValidBst(root , Long.MIN_VALUE , Long.MAX_VALUE);
    }
    boolean ValidBst(TreeNode Node ,long  min ,long max){
        if(Node == null)return true;
        if(Node.val <= min || Node.val >= max) return false;
        
        return ValidBst(Node.left , min ,Node.val) && ValidBst(Node.right , Node.val , max);

    }
}
