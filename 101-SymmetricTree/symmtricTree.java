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
    //1st version: why this is wrong? even for [1,2]
    //**************!!!REASON!!!*********************
    //Since all are references, reflectByRoot() also change the original root.
    
    
    
    // public boolean isSymmetric(TreeNode root) {
    //     //by induction
    //     return isSame(root, reflectByRoot(root));
        
    // }
    // public TreeNode reflectByRoot(TreeNode root) {
    //     if (root == null) return null;
    //     TreeNode temp = root.left;
    //     root.left = reflectByRoot(root.right);
    //     root.right = reflectByRoot(temp);
        
    //     return root;
    // }
    
    // public boolean isSame(TreeNode root1, TreeNode root2) {
    //     if (root1 == null && root2 == null) {
    //         return true;
    //     } else if (root1 != null && root2 != null) {
    //         return root1.val == root2.val && isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    //     } else {
    //         return false;
    //     }
    // }
    //
    //2nd version:
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricHelp(root.left, root.right);
    }
    public boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        return left.val == right.val && isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
}