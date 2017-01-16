class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
    	vector<string> res;
    	int n=nums.size();
    	if(n==0)
    		return res;
    	
    	int startIdx=0;
    	while(startIdx<n){
    	    int endIdx=startIdx;
    	    while(endIdx+1<n&&nums[endIdx+1]==nums[endIdx]+1){
    	        endIdx++;
    	    }
    	    if(startIdx==endIdx)    res.push_back(to_string(nums[startIdx]));
            else res.push_back(to_string(nums[startIdx])+"->"+to_string(nums[endIdx]));
    	    startIdx=endIdx+1;
    	}
    	return res;
    }
};