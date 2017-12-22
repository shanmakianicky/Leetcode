package Leetcode.ConstructBinaryTreeFromPostOrderAndInOrder;

public class attempt1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode construct(int[] preorder, int[] inorder){
        if (preorder.length != inorder.length || preorder.length == 0){
            return null;
        }
        return helper(preorder,inorder,0,0,inorder.length - 1);
    }

    public TreeNode helper(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd){
        if (inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        for (int i = inStart; i <= inEnd; i++){
            if (inorder[i] == root.val){
                index = i;
            }
        }
        // important
        root.left = helper(preorder, inorder, preStart+1, inStart, index - 1);
        root.right = helper(preorder, inorder, preStart + index - inStart + 1, index+1, inEnd);
        return root;
    }
}
