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
    public int pathSum(TreeNode root, int sum) {
        // 1st verion: There is a mistake, why? check [2,6,8,2,3,null,null,6], 8
        // reason: pathSum(root.left, sum -root.val) has intersection with 
        // pathSum(root.right, sum-root.val)
        // if (root == null) return 0;
        
        // int rslt = (root.val == sum ? 1 : 0);
        
        // rslt += pathSum(root.left, sum - root.val) + pathSum(root.left, sum);
        // rslt += pathSum(root.right, sum - root.val) + pathSum(root.right, sum);
        
        
        // return rslt;
        if (root == null) return 0;
        return pathSumFromRoot(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        

        
    }
    
    public int pathSumFromRoot(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSumFromRoot(root.left, sum-root.val) + pathSumFromRoot(root.right, sum -root.val) + (root.val == sum ? 1:0);
    }
}