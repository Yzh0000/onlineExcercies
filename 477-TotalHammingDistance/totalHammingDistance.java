public class Solution {
    public int totalHammingDistance(int[] nums) {
        //1st version, time limit exceed
        // // less than two elements
        // if (nums.length < 2) return 0;
        // //else
        // int rslt = 0;
        // for (int i  = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) continue;
        //         rslt += Integer.bitCount(nums[i] ^ nums[j]);
        //     }
        // }
        
        // return rslt;
        
        //2nd version: count sum bitwise
        //cosider an array has m 0s, and n 1s. Then its total hamming distance is mn.
        int rslt = 0;
        //number of 1 for each bit
        int[] distance = new int[31];
        
        for (int i = 0; i< nums.length; i++) {
            for (int j = 0; j < 31; j++) {
                distance[j] += (nums[i] >> j) & 1;
            }
        }
        
        for (int j : distance) {
            rslt += j * (nums.length - j);
        }
        
        return rslt;
        
    }
}