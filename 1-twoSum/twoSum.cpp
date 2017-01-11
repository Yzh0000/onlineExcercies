class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> res;
        unordered_map<int,int> mp;  //num->idx
        for(int i=0;i<nums.size();i++){
            if(mp.find(nums[i])!=mp.end()){
                res.push_back(mp[nums[i]]);
                res.push_back(i);
            }
            else{
                mp[target-nums[i]]=i;
            }
        }
        return res;
    }
};