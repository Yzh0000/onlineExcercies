class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int n=nums.size();
        int minDiff=INT_MAX;
        int curSum=0;
        sort(nums.begin(),nums.end());
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(r>l){
                int sum=nums[i]+nums[l]+nums[r];
                int diff=abs(sum-target);
                if(diff<minDiff){
                    minDiff=diff;
                    curSum=sum;
                }
                if(sum==target) return target;
                if(sum>target)  r--;
                if(sum<target)  l++;
            }
        }
        return curSum;
    }
};