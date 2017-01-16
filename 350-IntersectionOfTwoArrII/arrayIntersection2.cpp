class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        vector<int> res;
        unordered_map<int,int> mp;
        for(int num:nums1){
            mp[num]++;
        }
        for(int num:nums2){
            if(mp.count(num)&&mp[num]>0){
                mp[num]--;
                res.push_back(num);
            }
        }
        return res;
    }
};