class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> ress;
        vector<int> res;
        int sum=0;
        sort(candidates.begin(),candidates.end());
        myfun(candidates,target,0,res,ress,sum);
        return ress;
    }
    
    void myfun(vector<int>& candidates, int target, int start, vector<int>& res, vector<vector<int>>& ress,int& sum){
        if(sum==target){
            ress.push_back(res);
            return;
        }
        if(sum>target)  return;
        
        for(int i=start;i<candidates.size();i++){
            res.push_back(candidates[i]);
            sum+=candidates[i];
            myfun(candidates,target,i,res,ress,sum);
            sum-=candidates[i];
            res.pop_back();
        }
    }
};