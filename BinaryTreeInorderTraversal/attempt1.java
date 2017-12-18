package Leetcode.BinaryTreeInorderTraversal;

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
    public List<Integer> inorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }
    private void helper(TreeNode node, List<Integer> list){
        if (node == null){
            return;
        }
        helper(node.left,list);
        list.add(node.val);
        helper(node.right,list);
    }
}
