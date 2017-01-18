class Solution {
public:
    int rob(vector<int>& nums) {
        int n=nums.size();
        if(n==0)    return 0;
        if(n==1)    return nums[0];
        
        int x1=0;
        int pre1=0;
        
        int x2=0;
        int pre2=0;
        
        int x;
        
        for(int i=0;i<n-1;i++){
            x=max(x1,pre1+nums[i]);
            pre1=x1;
            x1=x;
        }
        
        for(int i=1;i<n;i++){
            x=max(x2,pre2+nums[i]);
            pre2=x2;
            x2=x;
        }
        
        return max(x1,x2);
    }
};
