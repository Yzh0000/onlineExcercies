class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> res;
        unordered_set<int> st(nums1.begin(),nums1.end());
        for(int num:nums2){
            if(st.count(num)){
                res.push_back(num);
                st.erase(num);
            }
        }
        return res;
    }
};