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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        
        int lh = minDepth(root.left);
        int rh = minDepth(root.right);
        if (lh == 0 || rh == 0) return lh + rh +1;
        return lh < rh ? lh+1 : rh+1;
        
    }
}