/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int maxPathSum(TreeNode* root) {
        int res=INT_MIN;
        maxFromRoot(root,res);
        return res;
    }
    
    int maxFromRoot(TreeNode* root, int& res){
        if(!root)   return 0;
        int left=maxFromRoot(root->left,res);
        int right=maxFromRoot(root->right,res);
        int v=root->val;
        int leftfix=max(left,0);
        int rightfix=max(right,0);
        res=max(res,leftfix+rightfix+v);
        return max(leftfix+v,rightfix+v);
    }
};