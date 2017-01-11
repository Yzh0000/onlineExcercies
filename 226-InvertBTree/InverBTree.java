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
    public TreeNode invertTree(TreeNode root) {
        //by recursion.
        //I have made a stupid mistake too...
        if (root == null)  return null;
        
        TreeNode tempTree = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tempTree);
        return root;
    }
}