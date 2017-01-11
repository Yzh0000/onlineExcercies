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
    public int sumOfLeftLeaves(TreeNode root) {
        // for each left node, we need to judge it is a leaf or not.
        if (root == null || isLeaf(root)) return 0;
        if (isLeaf(root.left)) {
            return root.left.val + sumOfLeftLeaves(root.right);
        } else {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
        
    }
    public boolean isLeaf(TreeNode root) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return true;
        } else {
            return false;
        }
    }
}