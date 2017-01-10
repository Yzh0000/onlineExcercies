public class Solution {
    public int singleNumber(int[] nums) {
        //use xor operation
        //For a integer a, a ^ a == 0, 0 ^ a == a.
        int rslt = 0;
        
        for (int i =0 ; i< nums.length; i++){
            rslt ^= nums[i];
        }
        
        return rslt;
        
    }
}