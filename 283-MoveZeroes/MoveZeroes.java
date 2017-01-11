public class Solution {
    public void moveZeroes(int[] nums) {
        //two pointer
        int i = 0, j =0;
        while(i <= j && j< nums.length) {
                if (nums[j] == 0) {
                    j++;
                } else if (i == j) {
                    j++;
                    i++;
                } else {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                }
        }

        
    }
}