public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;
        
        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            //found duplicates
            if (!set.add(num)) return true;
        }
        //other cases
        return false;
        
    }
}