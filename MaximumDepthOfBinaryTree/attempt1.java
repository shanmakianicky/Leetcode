package Leetcode.MaximumDepthOfBinaryTree;

public class attempt1 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode child = new TreeNode(2);
        root.left = child;
        System.out.println(max(root));
    }
    // solution 1
    public static int max(TreeNode root) {
        return maxDepth(root, 1, 1);
    }

    public static int maxDepth(TreeNode root, int max, int current) {
        if (root.left == null && root.right == null) {
            return max;
        }

        current++;
        int maxRight = 0;
        int maxLeft = 0;
        if (current > max) {
            max = current;
        }
        if (root.left != null) {
            maxLeft = maxDepth(root.left, max, current);
        }
        if (root.right != null) {
            maxRight = maxDepth(root.right, max, current);
        }
        max = Math.max(Math.max(maxLeft, maxRight), max);

        return max;
    }
    // solution 2(very beautiful)
    public int beautiful(TreeNode root){
        return root==null?0:1+Math.max(beautiful(root.left),beautiful(root.right));
    }
}
