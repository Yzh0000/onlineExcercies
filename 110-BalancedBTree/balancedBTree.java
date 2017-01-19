/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        //height is counted by paths.
        if (root == null) return true;
        int temp = Math.abs(height(root.left) - height(root.right));
        return temp <=1 && isBalanced(root.left) && isBalanced(root.right);
        
        
    }
    
    public int height(TreeNode root) {
        if (root == null) return -1;
        int lh = height(root.left);
        int rh = height(root.right);
        return lh < rh ? rh + 1: lh +1;
        // int temp = heigth(root.left) < height(root.right) ? height(r)
    }
}