public class Solution {
    public int majorityElement(int[] nums) {
        //sort an array: Arrays.sort()
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}