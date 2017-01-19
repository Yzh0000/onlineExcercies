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
    int getHeight(TreeNode* root){
        if(!root)   return 0;
        int l=getHeight(root->left);
        if(l==-1)   return -1;
        int r=getHeight(root->right);
        if(r==-1)   return -1;
        if(abs(l-r)>1) return -1;
        else return 1+max(l,r);
    }

    bool isBalanced(TreeNode* root) {
        if(!root)   return true;
        if(getHeight(root)==-1) return false;
        return true;
        
    }
};