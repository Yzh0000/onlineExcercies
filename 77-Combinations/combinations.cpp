class Solution {
public:
    vector<vector<int>> combine(int n, int k) {
        vector<int> res;
        vector<vector<int>> ress;
        myfun(1,n,k,res,ress);
        return ress;
    }
    
    void myfun(int small,int large,int k,vector<int>& res,vector<vector<int>>& ress){
        if(k==1){
            for(int i=small;i<=large;i++){
                res.push_back(i);
                ress.push_back(res);
                res.pop_back();
            }
        }
        else{
            for(int i=small;i<=large;i++){
                res.push_back(i);
                myfun(i+1,large,k-1,res,ress);
                res.pop_back();
            }
        }
    }
};