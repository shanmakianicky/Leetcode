package Leetcode.InvertBinaryTree;

public class attempt1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode invertTree(TreeNode root){
        if (root == null){
            return null;
        }
        helper(root);
        return root;
    }
    private void helper(TreeNode node){
        if (node == null){
            return;
        }
        if (node.left == null && node.right == null){
            return;
        }
        helper(node.left);
        helper(node.right);
        TreeNode left = node.left;
        TreeNode right = node.right;
        node.right = left;
        node.left = right;
    }
}
