class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        if(nums.size()==0)  return 0;

        int p1=0,p2=nums.size()-1;
        while(p1<p2){
            if(nums[p1]==val){
                if(nums[p2]!=val){
                    swap(nums[p1],nums[p2]);
                    p1++;
                    p2--;
                }
                else    p2--;
            }
            else p1++;
        }
        
        return nums[p1]==val?p1:p1+1;
    }
};