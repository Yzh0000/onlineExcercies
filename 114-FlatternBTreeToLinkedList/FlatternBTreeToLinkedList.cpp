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
    void flatten(TreeNode* root) {
        if(!root)   return;
        
        while(root->left||root->right){
            if(root->left){
                TreeNode* n1=root->left;
                while(n1->right)    n1=n1->right;
                n1->right=root->right;
                root->right=root->left;
                root->left=NULL;

            }
            root=root->right;
        }
    }
};