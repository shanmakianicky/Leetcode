package Leetcode.SymmetricTrees;

import java.util.ArrayList;
import java.util.List;

public class attempt1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return helper(root.left,root.right);
    }
    private boolean helper(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }else if (left == null || right == null){
            return false;
        }
        if (left.val != right.val){
            return false;
        }
        if (!helper(left.left,right.right) || !helper(left.right,right.left)){
            return false;
        }
        return true;
    }
}
