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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // 1.
        //!!!be careful here!!! Claim rslt as a LinkedList since List interface doesn't have addFirst().
        //Another choice is use List and add(0, intList).
        // 2.
        //Claim List<List<Integer>> by LinkedList<List<Integer>>, LinkedList<LinkedList<Integer>> will cause a mistake.
        
        LinkedList<List<Integer>> rslt = new LinkedList<List<Integer>>();
        if (root == null) return rslt;
        
        Deque<TreeNode> nodeList = new ArrayDeque<>();
        nodeList.offerLast(root);
        int size = nodeList.size();
        
        while (size != 0) {
            List<Integer> intList = new ArrayList<>();
            for (int i = 0; i< size; i++) {
                TreeNode node = nodeList.pollFirst();
                intList.add(node.val);
                
                if(node.left != null) nodeList.offerLast(node.left);
                if (node.right != null) nodeList.offerLast(node.right);
            }
            
            rslt.addFirst(intList);
            size = nodeList.size();
        }
        
        return rslt;
        
        
    }
}