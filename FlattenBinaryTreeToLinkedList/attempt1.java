package Leetcode.FlattenBinaryTreeToLinkedList;

public class attempt1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void flat(TreeNode root){

    }
    private void helper(TreeNode node){
        if ((node.left == null && node.right == null)){
            return;
        }
        helper(node.left);
        helper(node.right);
        TreeNode left = node.left;
        TreeNode right = node.right;
        node.left = null;
        if (left == null){
            return;
        }
        node.right = left;
        if (right != null){
            node.right.right = right;
        }
    }
}
