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
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> ress;
        vector<TreeNode*> res;
        if(!root)   return ress;
        res.push_back(root);
        
        while(res.size()){
            vector<TreeNode*> nodeLayer;
            vector<int> valueLayer;
            for(auto x:res){
                valueLayer.push_back(x->val);
                if(x->left) nodeLayer.push_back(x->left);
                if(x->right)    nodeLayer.push_back(x->right);    
            }
            res=nodeLayer;
            ress.push_back(valueLayer);
        }
        return ress;
    }
};
