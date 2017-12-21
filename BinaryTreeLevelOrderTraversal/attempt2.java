package Leetcode.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class attempt2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public List<List<Integer>> level(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int num = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                if (queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                temp.add(queue.poll().val);
            }
            list.add(temp);
        }
        return list;
    }
}
