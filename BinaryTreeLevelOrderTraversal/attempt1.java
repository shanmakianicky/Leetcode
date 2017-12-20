package Leetcode.BinaryTreeLevelOrderTraversal;

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
    public List<List<Integer>> level(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        return null;
    }
    private void helper(TreeNode node, List<Integer> list){
        if (node == null){
            list.add(null);
            return;
        }
        helper(node.left,list);
        helper(node.right,list);
        list.add(node.val);
    }
}
