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
        return 1+max(getHeight(root->left),getHeight(root->right));
    }

    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        int h=getHeight(root);
        
        vector<vector<int>> ress(h);
        vector<TreeNode*> res;
        if(!root)   return ress;
        res.push_back(root);

        h--;
        
        while(res.size()){
            vector<TreeNode*> nodeLayer;
            vector<int> valueLayer;
            for(auto x:res){
                valueLayer.push_back(x->val);
                if(x->left) nodeLayer.push_back(x->left);
                if(x->right)    nodeLayer.push_back(x->right);    
            }
            res=nodeLayer;
            ress[h]=valueLayer;
            h--;
        }
        return ress;
    }
};