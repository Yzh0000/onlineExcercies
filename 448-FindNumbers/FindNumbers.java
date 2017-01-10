public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // If i appears, then use nums[i-1] to store this information.
        // Change nums[i-1] to  -1 * nums[i-1].
        // For each position i, if it is negative, then i+1 appears
        // Furthermore, its absolute value is the vale it stored.
        List<Integer> rslt = new ArrayList<>();
        
        for (int i = 0; i< nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) nums[val] = -nums[val];
            
        }
        
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] > 0) {
                rslt.add(i+1);
            }
        }
        
        return rslt;
        
    }
}