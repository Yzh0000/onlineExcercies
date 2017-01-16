public class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        // by induction
        int[] rslt = new int[n];
        for (int i =0; i< n; i++) {
            rslt[0] = 1;
            rslt[1] = 2;
            if (i > 1) {
                rslt[i] = rslt[i-1]+ rslt[i-2];
            }
        }
        
        return rslt[n-1];

        
        
    }
}