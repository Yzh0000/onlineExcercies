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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rslt = new LinkedList<List<Integer>>();
        Deque<TreeNode> lvlNodes = new ArrayDeque<>();
        
        if (root == null) return rslt;
        lvlNodes.push(root);
        int size = lvlNodes.size();
        
        while (size != 0) {
            List<Integer> intList = new ArrayList<>();
            for (int i = 0; i< size; i++) {
                TreeNode node = lvlNodes.pop();
                intList.add(node.val);
                
                if(node.left != null) lvlNodes.addLast(node.left);
                if (node.right != null) lvlNodes.addLast(node.right);
            }
            rslt.add(intList);
            size = lvlNodes.size();
        }
        return rslt;
        
    }
}