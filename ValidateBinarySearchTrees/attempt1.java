package Leetcode.ValidateBinarySearchTrees;

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

    public boolean isValidBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root,res);
        if (res.size() == 0 || res.size() == 1){
            return true;
        }
        for (int i = 1; i < res.size(); i++){
            if (res.get(i) < res.get(i-1)){
                return false;
            }
        }
        return true;
    }
    private List<Integer> inOrder(TreeNode node, List<Integer> res){
        if (node == null){
            return res;
        }
        inOrder(node.left,res);
        res.add(node.val);
        inOrder(node.right,res);
        return res;
    }

}
