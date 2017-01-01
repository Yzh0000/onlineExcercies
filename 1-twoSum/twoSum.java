public class Solution {
    public int[] twoSum(int[] nums, int target) {
    // use dictionary to reduce searching time.
        
        int[] rslt = new int[2];
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            rslt[0] = i;
            rslt[1] = map.get(target - nums[i]);
            
        } else {
            map.put(nums[i], i);
        }
        }
        
        return rslt;

    }
}