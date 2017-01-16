/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Codec {
public:

    // Encodes a tree to a single string.
    string serialize(TreeNode* root) {
        if(!root)   return "";
        
        queue<TreeNode*> q;
        q.push(root);
        string data;
        while(!q.empty()){
            if(q.front()==NULL){
                data+="# ";
            }
            else{
                q.push(q.front()->left);
                q.push(q.front()->right);
                data+=to_string(q.front()->val)+" ";
            }
            q.pop();
        }
        return data;
    }

    // Decodes your encoded data to tree.
    TreeNode* deserialize(string data) {
        if(data.empty())    return NULL;
        
        stringstream ss(data);
        string s;
        ss>>s;
        TreeNode* root=new TreeNode(stoi(s));
        queue<TreeNode*> q;
        q.push(root);
        
        while(!q.empty()){
            ss>>s;
            if(s!="#"){
                q.front()->left=new TreeNode(stoi(s));
                q.push(q.front()->left);
            }
                
            ss>>s;
            if(s!="#"){
                q.front()->right=new TreeNode(stoi(s));
                q.push(q.front()->right);
            }
            q.pop();
         }
        
        return root;
    }
};

// Your Codec object will be instantiated and called as such:
// Codec codec;
// codec.deserialize(codec.serialize(root));