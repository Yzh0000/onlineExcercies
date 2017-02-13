class Solution {
public:

    int totalHammingDistance(vector<int>& nums) {
        int res=0;
        for(int i=0;i<sizeof(int)*8;i++){
            int bitCount=0;
        
            for(int j=0;j<nums.size();j++){
                if((nums[j]&(1<<i))!=0) bitCount++;
            }
            res+=bitCount*(nums.size()-bitCount);
        }
        return res;
    }
};