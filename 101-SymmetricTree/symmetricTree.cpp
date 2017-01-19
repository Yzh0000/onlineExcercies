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
    bool isSymmetric(TreeNode* root) {
        if(!root)   return true;
        return myfun(root->left,root->right);
    }
    
    bool myfun(TreeNode* r1,TreeNode* r2){
        if(!r1&&!r2)    return true;
        if(!r1||!r2||r1->val!=r2->val)    return false;
        return (myfun(r1->left,r2->right)&&myfun(r1->right,r2->left));
    }
};