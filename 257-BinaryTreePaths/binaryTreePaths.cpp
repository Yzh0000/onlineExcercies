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
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> res;
        string path;
        if(!root)   return res;
        path=to_string(root->val);
        myfun(root,res,path);
        return res;
    }
    
    void myfun(TreeNode* root, vector<string>& res, string path){
        if(!root->left&&!root->right)   res.push_back(path);
        if(root->left)  myfun(root->left,res,path+"->"+to_string(root->left->val));
        if(root->right) myfun(root->right,res,path+"->"+to_string(root->right->val));
    }
};