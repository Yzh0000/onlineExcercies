public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        //by induction
        int[] bestUpToN = new int[nums.length];
        bestUpToN[0] = nums[0];
        if ( nums.length > 1) {
            bestUpToN[1] = nums[0] < nums[1] ? nums[1] : nums[0];
        }
        for (int i = 2; i< nums.length; i++) {
            int temp = bestUpToN[i-2] + nums[i];//if broke ith house.
            //if don't broke ith house, best value is bestUpToN[i-1]
            //compare both value
            bestUpToN[i]= temp < bestUpToN[i-1] ? bestUpToN[i-1] : temp;
        }
        
        return bestUpToN[nums.length -1];
        
    }
}