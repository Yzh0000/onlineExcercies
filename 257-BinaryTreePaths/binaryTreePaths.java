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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> rslt = new ArrayList<>();
        if (root == null) return  rslt;
        if (root.left == null && root.right == null) {
            rslt.add(""+root.val);
            return rslt;
        }
        
        
        if (root.left != null) {
            List<String> leftPaths = binaryTreePaths(root.left);
            for (int i = 0; i< leftPaths.size(); i++) {
                String temp = ""+ root.val + "->"+ leftPaths.get(i);
                rslt.add(temp);
            }
        }
        
        if (root.right != null) {
            List<String> rightPaths = binaryTreePaths(root.right);
            for (int i = 0; i< rightPaths.size(); i++) {
                String temp = ""+ root.val + "->"+ rightPaths.get(i);
                rslt.add(temp);
            }
        }
        
        return rslt;
        
    }
}